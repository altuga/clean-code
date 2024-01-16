package org.jugistanbul.part1.strategy.good;

import java.math.BigDecimal;

public class LoanSpecial extends Loan {
	public LoanSpecial() {
		displayName = "Special";
		kkdfRate =  KKDRateEnum.LOW_KKD.getKKDValue();
	}

	@Override
	public BigDecimal calculate() {
		return null;
	}
}