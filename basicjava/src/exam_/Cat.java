package exam_;
public class Cat extends Animal {
	public Cat() {
	}
	public Cat(int speed) {
		super(speed);
	}
	
	public void run(int hour) {
		distance= hour*speed;
		hour++;
	}
	
	public void run() {
		
	}
}
