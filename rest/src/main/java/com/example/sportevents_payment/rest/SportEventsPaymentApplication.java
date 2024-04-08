package com.example.sportevents_payment.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sportevents_payment"})
@EntityScan(basePackages = {"com.example.sportevents_payment.persistence.entities"})
@EnableJpaRepositories(basePackages = {"com.example.sportevents_payment.persistence.repository"})
public class SportEventsPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(SportEventsPaymentApplication.class, args);
    }
}