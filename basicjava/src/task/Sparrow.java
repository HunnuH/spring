package task;
public class Sparrow {
	private String name;
	private int legs;
	private double length;
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void fly(){
	System.out.println("����("+name+")�� ���ƴٴմϴ�.");
}
public void sing(){
	System.out.println("����("+name+")�� �Ҹ����� ��ϴ�.");
}
public String toString(){
	return ("������ �̸��� "+name+"�Դϴ�.");
}
}

