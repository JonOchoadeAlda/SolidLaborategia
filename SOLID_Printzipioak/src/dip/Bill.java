package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc(Deduction dec, VAT vat) {

		// Dedukzioa kalkulatu
		billDeduction = dec.calcDeduction(billAmount, deductionPercentage);

		// VAT kalkulatzen dugu
		VAT = vat.calcVat(billAmount);

		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction);

		if (code != "0") {
			billTotal += VAT;
		}
	}
}
