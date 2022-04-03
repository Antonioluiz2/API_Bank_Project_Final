package br.com.luiz.itexperts.exceptions;

public class ExistsAccountByAccountCode extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExistsAccountByAccountCode() {
        super("There is already an account with the given number!");
    }
}
