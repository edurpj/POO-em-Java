package aplicattion;

import entiites.Account;
import entiites.BusinessAccount;
import entiites.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		/*
		Account acc = new Account(1000, "Eduardo", 0.0);
		BusinessAccount bcc = new BusinessAccount(1000, "João", 0.0, 500.0);
		
		//Upcasting
		
		Account acc1 = bcc;
		Account acc2 = new BusinessAccount(1000, "Max", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1200, "Maria", 0.0, 0.01);
		
		//downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100);
		
		//irá gerar erro na execução pois o acc3 não é businessAccount
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		*/
		
		Account acc1 = new Account(1000, "Eduardo", 1000.0);
		acc1.withdraw(200);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1000, "Maria", 1000.0, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());

	}

}
