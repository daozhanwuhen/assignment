package usb;

public class Circle implements Shape {
	double radius;
	void setRadius(double _radius){
		radius=_radius;
	}
	double getRadius(){
		return radius;
	}
	public double getCircumference() {
		return 2*3.14*radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

}
