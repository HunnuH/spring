package task2;
public class Coffee extends Beverage {
	static int amount;
	public Coffee () {
	}
	public Coffee(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void calcPrice() {
		if(getName().equals("Americano")) {
			price = 1500;
		} else if(getName().equals("CafeLatte")) {
			price = 2500;
		}else if(getName().equals("Cappuccino")) {
			price = 3000;
		}
	}
}
