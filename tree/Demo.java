package tree;

public class Demo {

	public static void main(String[] args) {
		Rectangle rect1=new Rectangle();
		rect1.printInfo();
		Rectangle rect2=new Rectangle(10.0,5.0);
		rect2.printInfo();
		rect2.getArea();
		/*Rectangle rect3=new Rectangle(10.0,5.0,"black");
		rect2.printInfo();
		rect2.getArea();*/
		Square square1=new Square();
		square1.printInfo();
		Square square2=new Square(20);
		square2.printInfo();
		square2.getArea();
	}

}
