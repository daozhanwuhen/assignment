package tree;

import java.awt.Color;

public class Square extends Rectangle {
	Square() {
	}

	Square(double l) {
		super(l);     //在参数满足什么情况下可以使用super关键字？
	}

	Square(double l, Color c) {
		length = l;
		color = c;
	}

	public void printInfo() {
		 System.out.println("正方形的边长"+" "+length+" "+"颜色"+" "+color+" "+getArea());
	}
	public double getArea() {
		return length*length;
	}
}
