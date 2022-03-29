package br.com.luiz.itexperts.exceptions;

public class ExistsCardByNumberAndFlagException extends RuntimeException{

    public ExistsCardByNumberAndFlagException() {
        super("There is already a card registered with this number and this flag!");
    }
}
