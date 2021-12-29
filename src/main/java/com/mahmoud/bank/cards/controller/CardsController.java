package com.mahmoud.bank.cards.controller;

import com.mahmoud.bank.cards.entity.Card;
import com.mahmoud.bank.cards.repo.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards/v1")
public class CardsController {

    @Autowired
    CardRepository repository;

    @GetMapping("/")
    public String home(){
        return "Welcome to Bank Cards API";
    }

    @PostMapping("/saveCard")
    public String saveCard(@RequestBody Card card){
          card = repository.save(card);
          return "Card saved successfully with ID = "+card.getCardId();
    }

    @GetMapping("/getCard/{cardId}")
    public Card getCard(@PathVariable long cardId){
        return repository.findByCardId(cardId);
    }

    @GetMapping("/getAllCards")
    public List<Card> getAllCards(){
        return (List<Card>) repository.findAll();
    }
}
