package task2;
public abstract class Content {
	String title;
	int price;
	
	public Content() {
	}	
	public Content(String title) {
	super();
    this.title = title;
	}
	
	public void show() {
		System.out.println(title+"�����ǰ�����"+price+"�� �Դϴ�.");
	}

	public abstract void totalPrice();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
