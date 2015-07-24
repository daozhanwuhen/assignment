package graph;

public class Square implements Graph {
    double side;
	Square(double side) {
		this.side = side;
	}
	
	double getSide() {
		return side;
	}

	public double getArea() {
		
		return side*side;
	}

}
