package usb;

public class Rectangle implements Shape {
	double length;
	double width;    //��������������Ե����úͻ�õķ���
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
