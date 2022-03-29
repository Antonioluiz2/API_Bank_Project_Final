package br.com.luiz.itexperts.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.luiz.itexperts.models.Card;
import br.com.luiz.itexperts.services.CardService;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value="Itexperts_cards")
@RestController
@RequestMapping(value = "/api/v1/cards")
public class CardController {

    @Autowired
    private CardService service;

    @ApiOperation(value="Retorna Cartão por Id")
    @GetMapping("{id}")
    public ResponseEntity<Card> findById(@PathVariable("id") Integer id) {
        Card card = service.findById(id);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    @ApiOperation(value="Retorna todos os Cartões")
    @GetMapping
    public ResponseEntity<List<Card>> findAll() {
        List<Card> cards = service.findAll();
        return new ResponseEntity<>(cards, HttpStatus.OK);
    }

    @ApiOperation(value="Deleta uma Cartão")
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
