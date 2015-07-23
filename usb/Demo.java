package usb;

public class Demo {

	public static void main(String[] args) {
    Rectangle rect=new Rectangle();
    rect.setAttribute(10, 5);
    System.out.println("矩形的周长是"+rect.getCircumference()+" "+"矩形的面积"+rect.getArea());
    Circle circle=new Circle();
    circle.setRadius(10);
    System.out.println("圆的周长是"+circle.getCircumference()+" "+"圆的面积"+circle.getArea());
	}
   
}
