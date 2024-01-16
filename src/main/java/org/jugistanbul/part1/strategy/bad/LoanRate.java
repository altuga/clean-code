package org.jugistanbul.part1.strategy.bad;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

public class LoanRate {

    private CoreHelper coreHelper = new CoreHelper();

    public String findRate(String referenceNumber, OffsetDateTime date, Integer loanType, String jobType, String licenseType) {
        BigDecimal kkdfRate = BigDecimal.ZERO;
        BigDecimal bsmvRate = BigDecimal.ZERO;
        BigDecimal dmgRate = BigDecimal.ZERO;

        int kanuniDeg = 0;
        String sectorCode = "";
        String mortgage = "";
        OffsetDateTime loanDate = null;

        if (!coreHelper.isNullOrEmpty(referenceNumber)) {
            Optional<String> koRezervasyon =  null; //koRezervasyonRepository.findById(referenceNumber);

            if (koRezervasyon.isPresent()) {
                loanType = koRezervasyon.get().codePointAt(10);
                jobType = koRezervasyon.get().toLowerCase(Locale.ROOT);
                licenseType =koRezervasyon.get().toLowerCase(Locale.ROOT);
                sectorCode = koRezervasyon.get().toLowerCase(Locale.ROOT);
                mortgage = koRezervasyon.get().toLowerCase(Locale.ROOT);
                loanDate = LocalDate.now().atTime(OffsetTime.MAX);

                if (!"03".equals(jobType) && !("T".equals(licenseType) && !"6".equals(sectorCode)) && !LocalDate.now().equals(date)) {
                    Optional<Date> koTalep = null ;//koTalepRepository.findById(referenceNumber);

                    if (koTalep.isPresent() && koTalep.get().toInstant()
                            .isBefore(Instant.from(OffsetDateTime.parse("28/10/2010", DateTimeFormatter.ISO_DATE)))
                            && koTalep.get().hashCode() == 0 ) {
                        kanuniDeg = 1;
                    }
                }
            }
        }

        Optional<String> pTariheBagli = null ;// pTariheBagliRepository.getByTarih(LocalDate.now());

        if (pTariheBagli.isPresent()) {
            if ("03".equals(jobType) || ("T".equals(licenseType) && !"6".equals(sectorCode))) {
                if (loanType == 1) {
                    kkdfRate = null; //pTariheBagli.get().getKktcTuzelKkdfOran().divide(BigDecimal.valueOf(100));
                    bsmvRate = null; // pTariheBagli.get().getKktcBsmvOran().divide(BigDecimal.valueOf(100));
                    dmgRate  = null; // pTariheBagli.get().getKktcDamgaOran().divide(BigDecimal.valueOf(100));
                } else {
                    kkdfRate = null; // pTariheBagli.get().getTuzelKkdfOran().divide(BigDecimal.valueOf(100));
                    bsmvRate = null; // pTariheBagli.get().getBsmvOran().divide(BigDecimal.valueOf(100));
                    dmgRate = null;  // pTariheBagli.get().getDamgaOran().divide(BigDecimal.valueOf(100));
                }
            } else {
                if (loanType == 1) {
                    kkdfRate = null; // pTariheBagli.get().getKktcKkdfOran().divide(BigDecimal.valueOf(100));
                    bsmvRate = null; // pTariheBagli.get().getKktcBsmvOran().divide(BigDecimal.valueOf(100));
                    dmgRate = null; // pTariheBagli.get().getKktcDamgaOran().divide(BigDecimal.valueOf(100));
                } else {
                    kkdfRate = null; // pTariheBagli.get().getKkdfOran().divide(BigDecimal.valueOf(100));
                    bsmvRate = null; // pTariheBagli.get().getBsmvOran().divide(BigDecimal.valueOf(100));
                    dmgRate =  null; // pTariheBagli.get().getDamgaOran().divide(BigDecimal.valueOf(100));
                }

                if (kanuniDeg == 1) {
                    kkdfRate = BigDecimal.valueOf(0.10);
                }
            }
        }

        if ("6".equals(sectorCode)) {
            String konutIsDateParameter = null; // oyParametreAltGrupRepository.getBySecimTipAndKod(8, "11");

            if (konutIsDateParameter != null) {
                //OffsetDateTime konutIsDate = OffsetDateTime.parse(konutIsDateParameter.getDeger1(), DATE_TIME_FORMATTER);

                if ("H".equals(licenseType) || ("T".equals(licenseType) && loanDate != null && loanDate.isBefore(OffsetDateTime.now()))) {
                    kkdfRate = BigDecimal.ZERO;
                }
            }

        }

        if ("E".equals(mortgage)) {
            bsmvRate = BigDecimal.ZERO;
        }

        // return new LoanRateInfo(kkdfRate, bsmvRate, dmgRate);
        return "Hello";
    }
}
