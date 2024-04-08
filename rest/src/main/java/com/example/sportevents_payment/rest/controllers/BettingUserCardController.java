package com.example.sportevents_payment.rest.controllers;

import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardInput;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardOperation;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
@RequiredArgsConstructor
public class BettingUserCardController {

    private final CreateBettingUserCardOperation createBettingUserCardOperation;

    @PostMapping("/create")
    public ResponseEntity<CreateBettingUserCardOutput> createCard(@RequestBody CreateBettingUserCardInput input) {
        return ResponseEntity.status(201).body(createBettingUserCardOperation.process(input));
    }

}
