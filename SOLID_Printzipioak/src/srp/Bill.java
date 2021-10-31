package srp;

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
	public void totalCalc() {

		// Dedukzioa kalkulatu
		Deduction dec = new Deduction();
		billDeduction = dec.calcDeduction(billAmount, deductionPercentage);

		// VAT kalkulatzen dugu
		VAT vat = new VAT();
		VAT = vat.calcVat(billAmount);

		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction);

		if (code != "0") {
			billTotal += VAT;
		}
	}
}
