package usb;

public class Demo {

	public static void main(String[] args) {
    Rectangle rect=new Rectangle();
    rect.setAttribute(10, 5);
    System.out.println("���ε��ܳ���"+rect.getCircumference()+" "+"���ε����"+rect.getArea());
    Circle circle=new Circle();
    circle.setRadius(10);
    System.out.println("Բ���ܳ���"+circle.getCircumference()+" "+"Բ�����"+circle.getArea());
	}
   
}
