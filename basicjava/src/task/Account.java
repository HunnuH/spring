package task;
public class Account {
    private int balance = 0;
    private String accNo = null;
    public void setAccNo(String accNo){
		    this.accNo = accNo;
        System.out.println(accNo + " ���°� �����Ǿ����ϴ�.");
	}
    public void save(int money){
        balance = balance + money;
        System.out.println(accNo + " ���¿� " + money + "������ �ԱݵǾ����ϴ�.");
    }
    public void deposit(int money){
        balance = balance - money;
        System.out.println(accNo + " ���¿� " + money + "������ ��ݵǾ����ϴ�.");
    }
    public String getAccNo(){
        return accNo;
    }
    public int getBalance(){
        return balance;
    }
}