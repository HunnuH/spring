package task2;
public class student {
	private String name ;
	private String subject; 
	private int fee;
    
	public void calcReturnFee() {
		int i =0;

		if() {
			calcReturnFee = fee*0.2;
		}else if{
			calcReturnFee = fee*0.25;
		}else {
			System.out.println("그런 과정명은 없습니다");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
}
