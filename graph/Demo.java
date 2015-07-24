package graph;

public class Demo {
	public static void main(String[] args) {
		Rectangle rect=new Rectangle(5.0,10.0);
	    Square square=new Square(5.0);
	    Circle circle=new Circle(5.0);
	    Rriangle triangle=new Rriangle(5.0,2.0);
        System.out.println("总面积为"+getTotalArea(rect, square, circle, triangle));
	}
	public static double getTotalArea(Rectangle rect,Square square,Circle circle,Rriangle triangle){
		int []array={3,4,5,6};  //用数组存放各种形状的个数
		return array[0]*rect.getArea()+array[1]*square.getArea()+array[2]*circle.getArea()+array[3]*triangle.getArea();
    }
}
