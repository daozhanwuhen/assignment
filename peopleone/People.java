package people;

public class People {
   Body body=new Body(50.0,150.0);
   Hand hand=new Hand(10.0,80.0);
   Leg leg=new Leg(30.0,100.0);
   void think(){
	   System.out.println("�˿���˼��");
   }
   public void weight(){
	   System.out.println("�˵�����="+body.getWeight()+"+"+hand.getWeight()+"+"+leg.getWeight());
   }
   public void length(){
	   System.out.println("�˵����="+body.getLength()+"+"+hand.getLength()+"+"+leg.getLength());
   }
}
