package people;

public class Hand extends Limb {
	Hand(double w,double l){
		super(w,l);
    	weight=w;
    	length=l;
    }
	void write(){
		System.out.println("手可以写作");
	}
}
