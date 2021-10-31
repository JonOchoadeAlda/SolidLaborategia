package ocp;

public class Square implements Figure {
	float lenght;

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	@Override
	public void draw() {
		System.out.println("[]SQUARE[]");

	}

	@Override
	public double getArea() {

		return lenght * lenght;
	}

}
