package task;

public class Prob1 {
	public static void main(String[] args) {
		Emp emp = new Emp("12345","È«±æµ¿",50000);
		emp.setId("12345");
		emp.setName("È«±æµ¿");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "ºÀ±Þ = " + emp.getSalary( 30 ) );
	}
}
