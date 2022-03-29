package br.com.luiz.itexperts.exceptions;

public class ExistsAccountByAccountCode extends RuntimeException {

    public ExistsAccountByAccountCode() {
        super("There is already an account with the given number!");
    }
}
