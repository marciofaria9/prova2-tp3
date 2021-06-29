package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.customer.Customer;
import br.edu.univas.exception.PaymentMethodNotAllowedException;
import br.edu.univas.vo.AccountDebit;
import br.edu.univas.vo.BankSlip;
import br.edu.univas.vo.CreditCard;
import br.edu.univas.vo.PaymentMethod;
import br.edu.univas.vo.Pix;

public class CustommerController {

	private Scanner scanner = new Scanner(System.in);
	private Customer custumer = new Customer();

	public Customer createCustomer() throws PaymentMethodNotAllowedException {
		Customer customer = new Customer();

		System.out.println("Cadastro");

		System.out.println("digite o id");
		customer.setId(scanner.nextLong());
		scanner.nextLine();

		System.out.println("digite o nome:");
		customer.setName(scanner.nextLine());

		System.out.println("digite o CPF:");
		customer.setCpf(scanner.nextLine());

		System.out.println("Informe o metodo de pagamento:");
		System.out.println("1 - Credito");
		System.out.println("2 - Debito");
		System.out.println("3 - Pix");
		System.out.println("4 - BankSlip");

		int choice = scanner.nextInt();
		scanner.nextLine();

		if (choice == 1) {
			CreditCard credito = new CreditCard();
			customer.setPaymentMethod(credito);

		}

		else if (choice == 2) {
			AccountDebit debito = new AccountDebit();
			customer.setPaymentMethod(debito);
		}

		else if (choice == 3) {
			Pix pix = new Pix();
			customer.setPaymentMethod(pix);

		} else if (choice == 4) {
			BankSlip bk = new BankSlip();
			customer.setPaymentMethod(bk);

		}

		if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {

			throw new PaymentMethodNotAllowedException("Número inválido");

		}

		return customer;

	}

}
