package com.example.sportevents_payment.api.inputoutput.betresult;

import com.example.sportevents_payment.api.base.OperationInput;
import lombok.*;

import java.util.Set;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReceiveBetsSetInput implements OperationInput {

    private Set<ReceiveBetsInput> receivedBets;
}
