package org.jugistanbul.part1.strategy.good;

public class LoanFactory {
	public Loan createLoan(int loneId) {
		Loan loan = null;
		if (loneId == LoanTypeEnum.Vehicle.getLoadId()) {
			loan = new LoanVehicles();
			loan.setJobType(null) ; // !WARNING! koTalepRepository.findById(referenceNumber);
			loan.setKkdfRate(null); // !WARNING! koTalepRepository.findById(referenceNumber);
			loan.setSectorCode(null) ; // !WARNING! koTalepRepository.findById(referenceNumber);
		}
		else if (loneId == LoanTypeEnum.Personel.getLoadId()) {
			loan = new LoanPersonel();
			loan.setJobType(null)  ; // !WARNING! koTalepRepository.findById(referenceNumber);
			loan.setKkdfRate(null);// !WARNING! koTalepRepository.findById(referenceNumber);
			loan.setSectorCode(null) ;  // !WARNING! koTalepRepository.findById(referenceNumber);
		}
		else if (loneId == LoanTypeEnum.Mortgage.getLoadId()) {
			loan = new LoanMortgage();
			//loan.setJobType(null)  ; // !WARNING! koTalepRepository.findById(referenceNumber);
			//loan.setKkdfRate(null); // !WARNING! koTalepRepository.findById(referenceNumber);
			//loan.setSectorCode(null) ; // !WARNING! koTalepRepository.findById(referenceNumber);
			loan.setDisplayName("Mortgage Loan set");
		}
		else if (loneId == LoanTypeEnum.Special.getLoadId()) {
			loan = new LoanSpecial();
			loan.setJobType(null)  ; // !WARNING! koTalepRepository.findById(referenceNumber);
			loan.setKkdfRate(null); // !WARNING! koTalepRepository.findById(referenceNumber);
			loan.setSectorCode(null) ; // !WARNING! koTalepRepository.findById(referenceNumber);
		}
		return loan;
	}
}