package org.jugistanbul.part1.strategy.good;

import java.math.BigDecimal;

public class LoanVehicles extends Loan {
	public LoanVehicles() {
		displayName = "LoanVehicles";
		kkdfRate = BigDecimal.valueOf(0.08);;
	}

	@Override
	public BigDecimal calculate() {
		return null;
	}
}