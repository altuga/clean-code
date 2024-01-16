package org.jugistanbul.part1.strategy.good;



public class CustomerForMortgage extends Customer {
	public CustomerForMortgage(LoanFactory loanFactory) {
		loan = loanFactory.createLoan(LoanTypeEnum.Mortgage.getLoadId());
		loan.calculate(); // polymorphism
		//
		// ...
	}
	public void createCalendar() {
		// make calendar from appointments
		System.out.println("Making the Loan payment calendar");
	}
}