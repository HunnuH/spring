package task2;
public class Bike extends Wheeler{
	public Bike () {
	}
    public Bike(String carName, int velocity, int wheelNumber) {
    	super(carName, velocity, wheelNumber);
    }
    public void speedUp(int speed) {
    	velocity= velocity + speed;
    	if(velocity > 40 ) {
    		velocity = 40;
    	} else {
    		System.out.println("자전거의 현재속도는"+velocity+"입니다.");
    	}
	}
	public void speedDown(int speed) {
		velocity= velocity - speed;
		if(velocity < 10) {
    		velocity = 10;
    		System.out.println("자전거의 최저속도 위반으로 속도를 10으로 올립니다.");
		}	
	}
}
