package simulator;

public class CarShop {
	int money;
	void setCar(Car c){
		c.setName(null);
	}
void sellCar(Car c){
	System.out.println("����"+c.getName()+"�ļ۸�"+c.getPrice());
}
void setMoney(int _money){
	money=_money;
}
int getMoney(){
	return money;
}
}
