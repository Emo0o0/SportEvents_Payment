package com.example.sportevents_payment.persistence.repository;

import com.example.sportevents_payment.persistence.entities.OldBets;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OldBetsRepository extends JpaRepository<OldBets, UUID> {
}
