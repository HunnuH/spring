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
/*name������ private���� �ܺο��� ���ٺҶ�� �����Ǿ��� ������ private�޼ҵ带 
     ���� �����ϰ� ���� ������ �� �ֵ��� ���� 
     name������ ���� �����ϴ� �޼ҵ� : setter�޼ҵ�
     name������ ����� ���� ������ �ִ� �޼ҵ� : getter�޼ҵ� 
     set(get) + ���������(������ ù ���ڴ� �빮��) */
	}