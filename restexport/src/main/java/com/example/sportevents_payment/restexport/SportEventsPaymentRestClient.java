package com.example.sportevents_payment.restexport;

import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsOutput;
import com.example.sportevents_payment.api.inputoutput.betresult.ReceiveBetsSetInput;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardInput;
import com.example.sportevents_payment.api.inputoutput.bettingusercard.create.CreateBettingUserCardOutput;
import feign.Headers;
import feign.RequestLine;

@Headers({"Content-Type: application/json"})
public interface SportEventsPaymentRestClient {

    @RequestLine("POST /card/create")
    public CreateBettingUserCardOutput createCard(CreateBettingUserCardInput input);

    @RequestLine("PATCH /card/receive")
    public ReceiveBetsOutput receive(ReceiveBetsSetInput input);

}
