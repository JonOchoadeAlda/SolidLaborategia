package srp;

public class VAT {
	double percentage = 0.16;

	public float calcVat(float billAmount) {
		return (float) (billAmount * percentage);
	}
}
