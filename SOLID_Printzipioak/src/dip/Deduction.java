package dip;

public class Deduction implements IDeduction{

	public float calcDeduction(float billAmount,float deductionPercentage) {

		if (billAmount > 50000)
			return (billAmount * deductionPercentage + 5) / 100;
		else
			return (billAmount * deductionPercentage) / 100;

	}
}
