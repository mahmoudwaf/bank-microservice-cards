package com.mahmoud.bank.cards.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Card {
    @Id
    @GeneratedValue
    @Column(name = "card_id")
    private long cardId;
    @Column(name = "account_id")
    private long accountId;
    @Column(name = "create_date")
    private LocalDate createDate;
}
