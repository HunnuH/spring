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
		System.out.println("������ ���������� ���ҵǾ����ϴ�.");
		System.out.println("[ ���� ���� ���� ]");
		return "������ : "+getShopName()+"\n��ǰ�� : "+getProductName()+"\n��ǰ���� : "+getProductPrice()+"\n���ݿ�������ȣ : "+getCashReceiptNumber();
	}
	public void pay() {
		
	}

}
