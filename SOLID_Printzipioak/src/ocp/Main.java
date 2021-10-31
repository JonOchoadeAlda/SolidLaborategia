package ocp;

public class Main {

	public static void main(String[] args) {

		Sheet s = new Sheet();

		Circle c = new Circle();
		c.setDiameter(2);
		Circle c2 = new Circle();
		c2.setDiameter(3);
		Square sq = new Square();
		sq.setLenght(4);
		Diamond d = new Diamond();
		d.setAltuera(2);
		d.setZabalera(3);
		s.addFigure(c);
		s.addFigure(c2);
		s.addFigure(sq);
		s.addFigure(d);

		s.drawFigures();

		s.printAreas();

	}

}
