package com.example.sportevents_payment.api.inputoutput.betresult;

import com.example.sportevents_payment.api.base.OperationInput;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReceiveBetsInput {

    private String userId;
    private String bookmakerOfferId;
    private BigDecimal betAmount;
    private int pickedTeam;
    private int teamWon;
    private String odds;

}
