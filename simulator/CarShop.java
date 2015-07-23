package simulator;

public class CarShop {
	int money;
	void setCar(Car c){
		c.setName(null);
	}
void sellCar(Car c){
	System.out.println("车名"+c.getName()+"的价格"+c.getPrice());
}
void setMoney(int _money){
	money=_money;
}
int getMoney(){
	return money;
}
}
