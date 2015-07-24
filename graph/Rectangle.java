package graph;

public class Rectangle implements Graph {
     double length;
     double width;
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	double getLength() {
		return length;
	}

	double getWidth() {
		return width;
	}

	public double getArea() {
		return length*width;
	}

}
