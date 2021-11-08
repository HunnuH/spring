package api.lang;
public class CardPayment extends Payment{
	private String cardNumber;
	private String cardPassword;
	private int monthlylnstallment;
	public CardPayment() {
	}
	public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlylnstallment) {
		super(shopName,productName,productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlylnstallment = monthlylnstallment;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public int getMonthlylnstallment() {
		return monthlylnstallment;
	}
	public void setMonthlylnstallment(int monthlylnstallment) {
		this.monthlylnstallment = monthlylnstallment;
	}

	public String toString() {
		System.out.println("�ſ�ī�尡 ���������� ���ҵǾ����ϴ�.");
		System.out.println("[ �ſ�ī�� ���� ���� ]");
		return "������ : "+getShopName()+"\n��ǰ�� : "+getProductName()+"\n��ǰ���� : "+getProductPrice()+"\n�ſ�ī���ȣ : "+getCardNumber()+"\n�Һΰ��� : "+getMonthlylnstallment();
	}
	public void pay() {
	}

}
