package tree;

import java.awt.Color;

public class Square extends Rectangle {
	Square() {
	}

	Square(double l) {
		super(l);     //�ڲ�������ʲô����¿���ʹ��super�ؼ��֣�
	}

	Square(double l, Color c) {
		length = l;
		color = c;
	}

	public void printInfo() {
		 System.out.println("�����εı߳�"+" "+length+" "+"��ɫ"+" "+color+" "+getArea());
	}
	public double getArea() {
		return length*length;
	}
}
