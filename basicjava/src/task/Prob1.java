package task;

public class Prob1 {
	public static void main(String[] args) {
		Emp emp = new Emp("12345","ȫ�浿",50000);
		emp.setId("12345");
		emp.setName("ȫ�浿");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "���� = " + emp.getSalary( 30 ) );
	}
}
