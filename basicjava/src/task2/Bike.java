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
    		System.out.println("�������� ����ӵ���"+velocity+"�Դϴ�.");
    	}
	}
	public void speedDown(int speed) {
		velocity= velocity - speed;
		if(velocity < 10) {
    		velocity = 10;
    		System.out.println("�������� �����ӵ� �������� �ӵ��� 10���� �ø��ϴ�.");
		}	
	}
}
