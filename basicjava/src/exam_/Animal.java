package exam_;
public abstract class Animal {
	protected int speed;
	protected double distance;
	public Animal () {
	}
	public Animal(int speed) {
		super();
		this.speed = speed;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public abstract void run();

}
