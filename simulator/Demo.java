package simulator;

public class Demo {

	public static void main(String[] args) {
		CarShop shop=new CarShop();
		shop.setCar(new BMW());
		shop.sellCar(new BMW());
		shop.setMoney(10000000);
		shop.getMoney();
	}

}
