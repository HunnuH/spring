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
		System.out.println("신용카드가 정상적으로 지불되었습니다.");
		System.out.println("[ 신용카드 결제 정보 ]");
		return "상점명 : "+getShopName()+"\n상품명 : "+getProductName()+"\n상품가격 : "+getProductPrice()+"\n신용카드번호 : "+getCardNumber()+"\n할부개월 : "+getMonthlylnstallment();
	}
	public void pay() {
	}

}
