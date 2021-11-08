package api.lang;
public abstract class Payment implements Payable {
	protected String shopName;
	protected String productName;
	protected long productPrice;
	public Payment() {
	}
	public Payment(String shopName, String productName, long productPrice) {
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public abstract void pay();
	public void print(long productPrice, int monthlylnstallment) throws IllegalArgumentException {
		if(productPrice<0 || monthlylnstallment<0) {
			throw new IllegalArgumentException("가격이나 할부개월수가 잘못되었습니다.");
		}
		if(productPrice<0 || monthlylnstallment<0) {
			productPrice = 0;
			monthlylnstallment = 0;
			return ;
		}
	}
}
