package com.example.sportevents_payment.persistence.repository;

import com.example.sportevents_payment.persistence.entities.BettingUserCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BettingUserCardRepository extends JpaRepository<BettingUserCard, UUID> {

    Optional<BettingUserCard> findByUserId(String userId);
}
