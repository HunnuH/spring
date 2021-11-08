package task2;
public class Truck extends Wheeler {
	public Truck () {
	}
    public Truck(String carName, int velocity, int wheelNumber) {
    	super(carName, velocity, wheelNumber);
    }
    public void speedUp(int speed) {
    	velocity= velocity + (5*speed);
    	if(velocity > 100 ) {
    		velocity = 100;
    	}  else {
    		System.out.println("트럭의 현재속도는"+velocity+ "입니다.");
    	}
	}
	public void speedDown(int speed) {
		velocity= velocity - (5*speed);
		if(velocity < 50) {
    		velocity = speed*50;
    		System.out.println("트럭의 최저속도 위반으로 속도를 50으로 올립니다.");
		}	
	}
}

