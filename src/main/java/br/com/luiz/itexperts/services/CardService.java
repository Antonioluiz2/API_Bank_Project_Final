package br.com.luiz.itexperts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.itexperts.models.Card;
import br.com.luiz.itexperts.repositories.CardRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;


    public Card findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Card not found!"));
    }

    public List<Card> findAll() {
        return repository.findAll();
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
