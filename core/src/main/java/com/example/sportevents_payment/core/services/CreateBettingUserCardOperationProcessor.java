package com.example.sportevents_payment.core.services;

import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardInput;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardOperation;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardOutput;
import com.example.sportevents_payment.persistence.entities.BettingUserCard;
import com.example.sportevents_payment.persistence.repository.BettingUserCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class CreateBettingUserCardOperationProcessor implements CreateBettingUserCardOperation {

    private final BettingUserCardRepository bettingUserCardRepository;

    @Override
    public CreateBettingUserCardOutput process(CreateBettingUserCardInput input) {

        Random random = new Random();

        BettingUserCard bettingUserCard = BettingUserCard.builder()
                .userId(input.getUserId())
                .amount(random.nextDouble(500) + 500)
                .build();

        bettingUserCardRepository.save(bettingUserCard);

        return CreateBettingUserCardOutput.builder()
                .id(bettingUserCard.getId().toString())
                .userId(bettingUserCard.getUserId())
                .amount(bettingUserCard.getAmount().toString())
                .build();
    }
}
