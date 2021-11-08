package inheritance;
public class Student extends Person {
  private String id;
public Student() {
  }
  public Student (String name,int age,String id) {
	    super(name, age);
    	this.id = id;
  }
  public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
   public void print() {
	super.print();
   	System.out.println(" ÇÐ   ¹ø : "+this.id);
   }
}