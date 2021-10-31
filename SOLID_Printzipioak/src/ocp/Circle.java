package ocp;

public class Circle implements Figure {
	float diameter;

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	@Override
	public void draw() {
		System.out.println("--- CIRLCE ---");

	}

	@Override
	public double getArea() {

		return Math.PI * diameter * diameter;
	}
}
