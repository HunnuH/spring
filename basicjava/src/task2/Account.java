package task2;
public class Account {
private String accId;
private String ownerName;
private long balance;
public Account() {
 }
 public Account(String accId,String ownerName, long balance) {
	super();
	this.accId = accId;
	this.ownerName = ownerName;
	this.balance = balance;
 }
 public void deposit (long amount) {
	 this.balance = this.balance+amount;
 }
 public void withdraw(long amount) {
	 this.balance = this.balance-amount;
 }
 public String getAccId() {
	return accId;
}
public void setAccId(String accId) {
	this.accId = accId;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}
}
