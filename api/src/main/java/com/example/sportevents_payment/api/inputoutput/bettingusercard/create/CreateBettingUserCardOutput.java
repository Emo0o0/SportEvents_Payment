package com.example.sportevents_payment.api.inputoutput.bettingusercard.create;

import com.example.sportevents_payment.api.base.OperationResult;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBettingUserCardOutput implements OperationResult {

    private String id;
    private String userId;
    private String amount;

}
