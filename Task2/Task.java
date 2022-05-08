package Task2;

import java.math.BigDecimal;

public class Task {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("100000"), new VATaxType(), taxService),
                new Bill(new BigDecimal("130000"), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal("70000"), new IncomeTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}