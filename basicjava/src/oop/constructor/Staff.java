package oop.constructor;
public class Staff {
	 private String name;
	 private int age;
	 private String dept;
	 
	 public Staff (String name,int age,String dept) {
		  	this.name = name;
		  	this.age = age;
		  	this.dept = dept;
		  }
	 
	    public void print() {
	    	System.out.println("�� �� : " +this.name+" �� �� : "+ this.age+ " ��   �� : "+this.dept);
	    }
 } 
