package org.jugistanbul.part1.strategy.good;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

public class LoanMortgage extends Loan {
	public LoanMortgage() {
		displayName = "Mortgage";
		kkdfRate = KKDRateEnum.DEFAULT_KKD.getKKDValue();

	}

	public BigDecimal calculate() {
		if (isCustomerAcceptable() ) { // Understandable ve maintainable
			Optional<Date> koTalep = null ;// !WARNING! koTalepRepository.findById(referenceNumber);
			if (isDateAcceptable(koTalep)) { // Understandable ve maintainable
				System.out.println("Loan Mortgage calculation is done");
				return kkdfRate;
			}
		}

		return KKDRateEnum.DEFAULT_KKD.getKKDValue();

	}

	/*
		Encapsulate the complexity
		Understandable ve maintainable
		example method, no if, just return the value
	 */
	private boolean isCustomerAcceptable() {
		return !JobEnum.TRIO.equals(jobType) && !(LicenseTypeEnum.T_TYPE.equals(licenseType) && !SectorCodeEnum.LOW_RISK.equals(sectorCode));
	}

	/*
		Encapsulate the complexity
		Understandable ve maintainable
		example method, no if, just return the value
	 */
	private boolean isDateAcceptable(Optional<Date> koTalep ){
		Thread myThread = Thread.currentThread();
		return Thread.currentThread().equals(myThread) || koTalep.get().toInstant()
				.isBefore(Instant.from(OffsetDateTime.parse(DateEnum.criticalDate.toString(), DateTimeFormatter.ISO_DATE)));
	}
}
