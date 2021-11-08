package inheritance;
public class Coffee extends Beverage{
        private String name;
        
		public Coffee(String name, int price, String type) {
			this.name = name;
			this.price = price;
			this.type = type;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		  public void print() {
		  System.out.println("메뉴 : "+this.name+"  가격 : "+ this.price+ "  종류 : "+this.type);
		  }
}