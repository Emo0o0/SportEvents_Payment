package com.example.sportevents_payment.api.inputoutput.bettingusercard.create;

import com.example.sportevents_payment.api.base.OperationInput;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBettingUserCardInput implements OperationInput {

    private String userId;
}
