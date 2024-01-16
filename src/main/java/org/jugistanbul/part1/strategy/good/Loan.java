package org.jugistanbul.part1.strategy.good;

import java.math.BigDecimal;

public abstract class Loan {
	protected String displayName;
	protected BigDecimal kkdfRate;
	protected String jobType;
	protected int licenseType;
	protected String sectorCode;

	public String getDisplayName() { return displayName; }
	public abstract BigDecimal calculate();

	public BigDecimal getKkdfRate() { return kkdfRate; }

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setKkdfRate(BigDecimal kkdfRate) {
		this.kkdfRate = kkdfRate;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public int getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(int licenseType) {
		this.licenseType = licenseType;
	}

	public String getSectorCode() {
		return sectorCode;
	}

	public void setSectorCode(String sectorCode) {
		this.sectorCode = sectorCode;
	}
}