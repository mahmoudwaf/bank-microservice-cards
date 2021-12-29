package com.mahmoud.bank.cards.repo;

import com.mahmoud.bank.cards.entity.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card,Long> {
    public  Card findByCardId(long cardId);
}
