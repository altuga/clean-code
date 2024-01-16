package org.jugistanbul.part1.strategy.good;

import java.util.*;

public class LoanTestDrive {
 
	public static void main(String[] args) {
		LoanFactory loanFactory = new LoanFactory();
		CustomerForMortgage customerForMortgage = new CustomerForMortgage(loanFactory);
		customerForMortgage.print();

	}
}
