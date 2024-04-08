package com.example.sportevents_payment.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OldBets {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String userId;
    private String bookmakerOfferId;
    private BigDecimal betAmount;
    private int pickedTeam;
    private int teamWon;
    private String odds;

}
