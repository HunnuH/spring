package oop.constructor;
public class Student {
  private String name;
  private int age;
  private String id;
    
  public Student (String name,int age,String id) {
  	this.name = name;
  	this.age = age;
  	this.id = id;
  }
   public void print() {
   	System.out.println("이 름 : " +this.name+" 나 이 : "+ this.age+ " 학   번 : "+this.id);
   }
}