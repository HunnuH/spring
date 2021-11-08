package exception;
public class CellPhone {
	String model;
	double battery;
	public CellPhone() {
	}
	public CellPhone(String model) {
		super();
		this.model = model;
	}
	public void call(int time) throws IllegalArgumentException{
		if(time<0) {
			throw new IllegalArgumentException("��ȭ�ð� �Է� ����");
		}
		battery = battery - (time * 0.5);
		if(battery<0) {
			battery=0;	
		}
		System.out.println("��ȭ�ð�: "+time+"��");
	}
	public void charge(int time) throws IllegalArgumentException{
		if(time<0) {
			throw new IllegalArgumentException("�����ð� �Է� ����");
		}
		battery = battery + (time * 3);
		if(battery>100) {
			battery=100;	
		}
		System.out.println("�����ð�: "+time+"��");
	}
	public void printBattery() {
		System.out.println("���� ���͸� ��:"+battery);
	}
	public boolean equals(Object otherObject) {
		if(otherObject instanceof CellPhone) {
			CellPhone obj = (CellPhone)otherObject;
			if(this.model.equals(obj.model)) {
				return true;
			}
		}
				return false;
	}
}