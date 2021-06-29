package br.edu.univas.exception;

public class PaymentMethodNotAllowedException extends Exception {
	
	private static final long serialVersionUID = 7728924831815034570L;

	
	public PaymentMethodNotAllowedException(String message) {		
		super(message);
	}
	
}
