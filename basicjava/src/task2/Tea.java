package task2;
public class Tea extends Beverage {
	static int amount;
	public Tea() {
	}
	public Tea(String name) {
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
		if(getName().equals("LeomonTea")) {
			price = 1500;
		} else if(getName().equals("ginsengTea")) {
			price = 2500;
		}else if(getName().equals("redginsengTea")) {
			price = 3000;
		}
	}
}
