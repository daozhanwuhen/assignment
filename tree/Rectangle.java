package tree;

import java.awt.Color;

public class Rectangle implements Graph {
	double length,width;
	Color color;
	Rectangle(){}
	Rectangle(double l)
	{
		length=l;
	}
	Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	Rectangle(double l,double w,Color c)
	{
		length=l;
		width=w;
		color=c;
	}
	public void printInfo() {
         System.out.println("�����εĳ�"+" "+length+" "+"��"+" "+width+" "+"��ɫ"+" "+color+" "+getArea());
	}

	public double getArea() {
		return length*width;
	}
}
