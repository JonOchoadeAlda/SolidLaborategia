package ocp;

public class Diamond implements Figure {
	float altuera;

	public float getAltuera() {
		return altuera;
	}

	public void setAltuera(float altuera) {
		this.altuera = altuera;
	}

	public float getZabalera() {
		return zabalera;
	}

	public void setZabalera(float zabalera) {
		this.zabalera = zabalera;
	}

	float zabalera;

	public void draw() {
		System.out.println("***DIAMOND***");

	}

	public double getArea() {

		return (altuera * zabalera) / 2;
	}

}
