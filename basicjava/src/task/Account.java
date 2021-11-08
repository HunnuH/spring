package task;
public class Account {
    private int balance = 0;
    private String accNo = null;
    public void setAccNo(String accNo){
		    this.accNo = accNo;
        System.out.println(accNo + " 계좌가 개설되었습니다.");
	}
    public void save(int money){
        balance = balance + money;
        System.out.println(accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
    }
    public void deposit(int money){
        balance = balance - money;
        System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
    }
    public String getAccNo(){
        return accNo;
    }
    public int getBalance(){
        return balance;
    }
}