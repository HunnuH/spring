package oop.constructor;
public class MyConstructorTest {
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
        obj.setId("jang");
        obj.setName("장동건");
        obj.setPass("1234");
        obj.setTelNum("010");
        obj.setSsn("730111");
        obj.setAddr("서울");
        obj.setNickName("짱");
        obj.print();
        MyConstructor obj2 = new MyConstructor("sd","lee","123");
        obj2.setTelNum("234");
        obj2.setSsn("732351");
        obj2.setAddr("서울");
        obj2.setNickName("가");
        obj2.print();	
        MyConstructor obj3 = new MyConstructor("ㅁㄹ","너e","153","천안","010");
        obj3.setSsn("73214");
        obj3.setNickName("구");
        obj3.print();	
        MyConstructor obj4 = new MyConstructor("바보","ㄴㅇ","153","천안","010","2131","김");
        obj4.print();	
	}
}
