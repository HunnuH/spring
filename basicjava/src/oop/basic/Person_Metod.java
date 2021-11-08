package oop.basic;
public class Person_Metod {
     private  String name;
     private int age;
     private String addr;
     
     public void  setName(String name) {
    	 this.name = name;
     }
     public String getName() {
    	 return this.name;
     }
     public void  setAge(int age) {
    	 this.age = age;
     }
     public int getAge() {
    	 return this.age;
     }
     public void  setAddr(String addr) {
    	 this.addr = addr;
     }
     public String getAddr() {
    	 return this.addr;
     }
/*name변수가 private으로 외부에서 접근불라고 설정되었기 때문에 private메소드를 
     통해 셋팅하고 값을 전달할 수 있도록 정의 
     name변수에 값을 셋팅하는 메소드 : setter메소드
     name변수에 저장된 값을 읽을수 있는 메소드 : getter메소드 
     set(get) + 멤버변수명(변수의 첫 글자는 대문자) */
	}