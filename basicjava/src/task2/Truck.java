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
    		System.out.println("Ʈ���� ����ӵ���"+velocity+ "�Դϴ�.");
    	}
	}
	public void speedDown(int speed) {
		velocity= velocity - (5*speed);
		if(velocity < 50) {
    		velocity = speed*50;
    		System.out.println("Ʈ���� �����ӵ� �������� �ӵ��� 50���� �ø��ϴ�.");
		}	
	}
}

