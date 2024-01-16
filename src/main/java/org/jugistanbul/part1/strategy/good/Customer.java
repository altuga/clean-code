package org.jugistanbul.part1.strategy.good;

import java.util.*;

public abstract class Customer {
	protected Loan loan;

	public void print() {
		System.out.println("--- " + loan.getDisplayName() + " Loan ---");
		// print all
		System.out.println("Loan Rate : " + loan.getKkdfRate());
	}
	public abstract void createCalendar();
}