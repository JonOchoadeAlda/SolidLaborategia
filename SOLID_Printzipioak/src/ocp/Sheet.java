package ocp;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {
	Vector<Figure> sheet = new Vector<Figure>();

	public void addFigure(Figure f) {
		sheet.add(f);
	}

	public void drawFigures() {
		Enumeration<Figure> figures = sheet.elements();
		Figure f;
		while (figures.hasMoreElements()) {
			f = figures.nextElement();
			f.draw();
		}
	}

	public void printAreas() {
		Enumeration<Figure> figures = sheet.elements();
		Figure f;
		while (figures.hasMoreElements()) {
			f = figures.nextElement();
			System.out.println(f.getArea());
		}

	}
}
