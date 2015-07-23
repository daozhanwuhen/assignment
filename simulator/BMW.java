package simulator;

public class BMW extends Car {
     void setName(String _name)
    {
    	name=_name;
    }
     void setPrice(int _price){
    	 price=_price;
     }
     String getName(){
    	 return name;
     }
     int getPrice(){
    	 return price;
     }
}
