package simulator;

public abstract class Car {
	String name;
    int price;
    abstract void setName(String _name);
    abstract void setPrice(int _price);
    abstract String getName();
    abstract int getPrice();
}
