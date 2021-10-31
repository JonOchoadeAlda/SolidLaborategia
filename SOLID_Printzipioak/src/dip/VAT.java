package dip;

public class VAT implements IVAT {
	double percentage = 0.16;

	public float calcVat(float billAmount) {
		return (float) (billAmount * percentage);
	}
}
