package com.example.sportevents_payment.api.inputoutput.betresult;

import com.example.sportevents_payment.api.base.OperationResult;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReceiveBetsOutput implements OperationResult {

    private Boolean success;

}
