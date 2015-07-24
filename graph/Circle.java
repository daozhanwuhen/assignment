package graph;

public class Circle implements Graph {
    double radius;
	Circle(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}

	public double getArea() {

		return 3.14*radius*radius;
	}

}
