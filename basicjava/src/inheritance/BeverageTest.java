package inheritance;
public class BeverageTest {
	public static void main(String[] args) {
		Coffee coffee1 = new Coffee("커피",2500,"아메리카노");
		Coffee coffee2 = new Coffee("커피",5200,"라떼");
		Coffee coffee3 = new Coffee("커피",3500,"밀크티");
      
      coffee1.print();
      coffee2.print();
      coffee3.print();
      
	}
}
