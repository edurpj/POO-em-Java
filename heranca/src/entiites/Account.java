package entiites;

public class Account {

		private Integer numver;
		private String holder;
		//Protected fica visivel para outras subclasses
		protected Double balance;
		
		public Account() {
		}

		public Account(Integer numver, String holder, Double balance) {
			this.numver = numver;
			this.holder = holder;
			this.balance = balance;
		}

		public Integer getNumver() {
			return numver;
		}

		public void setNumver(Integer numver) {
			this.numver = numver;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public Double getBalance() {
			return balance;
		}

		public void withdraw(double amount) {
			balance = balance - amount - 10; 
		}
		
		public void deposit(double amount) {
			balance += amount;
		}
		
}
