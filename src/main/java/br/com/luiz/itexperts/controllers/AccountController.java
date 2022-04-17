package br.com.luiz.itexperts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import br.com.luiz.itexperts.models.Account;
import br.com.luiz.itexperts.models.Card;
import br.com.luiz.itexperts.services.AccountService;

@Api(value = "Itexperts_accounts")
@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

	@Autowired
	private AccountService service;

	@ApiOperation(value = "Retorna uma conta por ID")
	@GetMapping("{id}")
	public ResponseEntity<Account> findById(@PathVariable("id") Integer id) {

		Account account = service.findById(id);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@ApiOperation(value = "Retorna todas as contas cadastradas")
	@GetMapping
	public ResponseEntity<Account> findAll() {

		List<Account> accounts = service.findAll();
		return new ResponseEntity(accounts, HttpStatus.OK);
	}

	@ApiOperation(value = "Adiciona uma conta no Banco de Dados")
	@PostMapping
	public ResponseEntity<Account> save(@Valid @RequestBody Account account) {
		Account ac = service.save(account);
		return ResponseEntity.status(HttpStatus.CREATED).body(ac);

	}

	@ApiOperation(value = "Edita um dado da Conta, exceto cartões.")
	@PutMapping("/edit/{id}")
	public ResponseEntity<Account> edit(@PathVariable("id") Integer id, @Valid @RequestBody Account account) {
		Account ac = service.edit(id, account);
		return new ResponseEntity<>(ac, HttpStatus.CREATED);
	}

	@ApiOperation(value = "Adiciona um Cartão a Conta")
	@PutMapping("/addcard/{id}")
	public ResponseEntity<Account> addCard(@PathVariable("id") Integer id, @Valid @RequestBody Card card) {
		Account ac = service.addCard(id, card);
		return new ResponseEntity<Account>(ac, HttpStatus.OK);
	}

	@ApiOperation(value = "Deleta Uma Conta do Banco")
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
