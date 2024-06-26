package com.example.sportevents_payment.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BettingUserCard {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(unique = true)
    private String userId;
    private Double amount;

}
