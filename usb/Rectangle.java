package usb;

public class Rectangle implements Shape {
	double length;
	double width;    //怎样快捷生成属性的设置和获得的方法
	void setAttribute(double l,double w){
		length=l;
		width=w;
	}
	double getLength(){
		return length;
	}
	double getWidth(){
		return width;
	}
	public double getCircumference() {
		return 2*(length+width);
	}
	public double getArea() {

		return length*width;
	}

}
