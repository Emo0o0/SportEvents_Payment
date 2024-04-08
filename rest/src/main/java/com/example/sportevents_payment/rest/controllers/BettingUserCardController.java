package com.example.sportevents_payment.rest.controllers;

import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsOperation;
import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsOutput;
import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsSetInput;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardInput;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardOperation;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
@RequiredArgsConstructor
public class BettingUserCardController {

    private final CreateBettingUserCardOperation createBettingUserCardOperation;
    private final ReceiveBetsOperation receiveBetsOperation;

    @PostMapping("/create")
    public ResponseEntity<CreateBettingUserCardOutput> createCard(@RequestBody CreateBettingUserCardInput input) {
        return ResponseEntity.status(201).body(createBettingUserCardOperation.process(input));
    }

    @PatchMapping("/receive")
    public ResponseEntity<ReceiveBetsOutput> receiveBets(@RequestBody ReceiveBetsSetInput input) {
        return ResponseEntity.status(200).body(receiveBetsOperation.process(input));
    }

}
