package oop.constructor;
public class MyConstructorTest {
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
        obj.setId("jang");
        obj.setName("�嵿��");
        obj.setPass("1234");
        obj.setTelNum("010");
        obj.setSsn("730111");
        obj.setAddr("����");
        obj.setNickName("¯");
        obj.print();
        MyConstructor obj2 = new MyConstructor("sd","lee","123");
        obj2.setTelNum("234");
        obj2.setSsn("732351");
        obj2.setAddr("����");
        obj2.setNickName("��");
        obj2.print();	
        MyConstructor obj3 = new MyConstructor("����","��e","153","õ��","010");
        obj3.setSsn("73214");
        obj3.setNickName("��");
        obj3.print();	
        MyConstructor obj4 = new MyConstructor("�ٺ�","����","153","õ��","010","2131","��");
        obj4.print();	
	}
}
