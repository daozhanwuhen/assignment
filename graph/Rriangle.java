package graph;

public class Rriangle implements Graph {
     double base;
     double height;
	Rriangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	double getBase() {
		return base;
	}

	double getHeight() {
		return height;
	}

	public double getArea() {

		return 1/2*base*height;
	}

}
