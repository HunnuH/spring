package exam_;
public class Pig extends Animal {
	public Pig() {
	}
	public Pig(int speed) {
		super(speed);
	}
	public void run(int hour) {
		distance= (0.5*hour)*speed;
		hour++;
	}
	public void run() {
		
	}
	
}
