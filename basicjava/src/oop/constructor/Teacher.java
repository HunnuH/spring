package oop.constructor;
public class Teacher {
	 private String name;
	 private int age;
	 private String subject;
	 
	 public Teacher (String name,int age,String subject) {
		  	this.name = name;
		  	this.age = age;
		  	this.subject = subject;
		  }
	    public void print() {
	    	System.out.println("�� �� : " +this.name+" �� �� : "+ this.age+ " ������ : "+this.subject);
	    }
}
