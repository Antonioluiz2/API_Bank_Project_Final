package br.com.luiz.itexperts.exceptions;

public class ExistsCardAssociatedWithAccount extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExistsCardAssociatedWithAccount() {
        super("It is not possible to delete this account. There is still a card associated with it.!");
    }
}
