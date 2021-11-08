package oop.constructor;
public class MyConstructor {
	   private String name;
	   private String id;
	   private String pass;
	   private String addr;
	   private String telNum;
	   private String ssn;
	   private String nickName;
	
	public MyConstructor() {   
		 System.out.println("ss");
	}
	public MyConstructor(String name, String id, String pass) {
	  this.name = name;
	  this.id = id;
	  this.pass = pass;
	  System.out.println("3ea");
	}
	public MyConstructor(String name, String id, String pass,String addr, String telNum) {
		  this.name = name;
		  this.id = id;
		  this.pass = pass;
		  this.addr = addr;
		  this.telNum = telNum;
		  System.out.println("5ea");
   }
	public MyConstructor(String name, String id, String pass,String addr, String telNum,String ssn, String nickName) {
		  this(name,id,pass,addr,telNum);
		  this.ssn = ssn;
		  this.nickName = nickName;
		  System.out.println("7ea");
 }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public void print() {
		   	System.out.println("이 름 : " +this.name+" 나 이 : "+ this.pass+ " 학   번 : "+this.id);
		   }
  }