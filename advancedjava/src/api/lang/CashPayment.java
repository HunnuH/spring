package api.lang;
public class CashPayment extends Payment{
	private String cashReceiptNumber;
	public CashPayment() {
	}
	public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
		super(shopName,productName,productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}
	public String getCashReceiptNumber() {
		return cashReceiptNumber;
	}
	public void setCashReceiptNumber(String cashReceiptNumber) {
		this.cashReceiptNumber = cashReceiptNumber;
	}
	public String toString() {
		System.out.println("현금이 정상적으로 지불되었습니다.");
		System.out.println("[ 현금 결제 정보 ]");
		return "상점명 : "+getShopName()+"\n상품명 : "+getProductName()+"\n상품가격 : "+getProductPrice()+"\n현금영수증번호 : "+getCashReceiptNumber();
	}
	public void pay() {
		
	}

}
