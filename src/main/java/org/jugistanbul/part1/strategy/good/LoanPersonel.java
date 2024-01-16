package org.jugistanbul.part1.strategy.good;

import java.math.BigDecimal;

public class LoanPersonel extends Loan {
	public LoanPersonel() {
		displayName = "US/Mountain";
		kkdfRate =  BigDecimal.ZERO;;
	}

	@Override
	public BigDecimal calculate() {
		return null;
	}
}