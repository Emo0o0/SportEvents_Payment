package com.example.sportevents_payment.core.services;

import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsInput;
import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsOperation;
import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsOutput;
import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsSetInput;
import com.example.sportevents_payment.persistence.entities.BettingUserCard;
import com.example.sportevents_payment.persistence.repository.BettingUserCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ReceiveBetsOperationProcessor implements ReceiveBetsOperation {

    private final BettingUserCardRepository bettingUserCardRepository;

    @Override
    public ReceiveBetsOutput process(ReceiveBetsSetInput input) {

        for (ReceiveBetsInput rbi : input.getReceivedBets()) {
            if (rbi.getPickedTeam() == rbi.getTeamWon()) {
                String[] odds = rbi.getOdds().split(" ");
                Double odd = Double.parseDouble(odds[rbi.getPickedTeam()]);
                BettingUserCard card = bettingUserCardRepository.findByUserId(rbi.getUserId())
                        .orElseThrow(() -> new RuntimeException("card not found"));
                card.setAmount((rbi.getBetAmount().multiply(new BigDecimal(odd))).add(BigDecimal.valueOf(card.getAmount())).doubleValue());
                bettingUserCardRepository.save(card);
            }
        }
        return ReceiveBetsOutput.builder()
                .success(true)
                .build();

    }
}
