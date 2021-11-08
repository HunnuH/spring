package api.lang;
public class Vehicle {
	Owner owner;
	int price;
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString(){
		return "소유주정보 : "+owner+" \n차량정보 : 가격은 "+price+"입니다."; 
	}
	public boolean equals(Object obj){
		if(obj!=null & obj instanceof Vehicle){
			Vehicle o = (Vehicle)obj;
			if(this.owner.equals(o.getOwner())){
				return true;//일치한다.
			}
		}
		return false;
	}
}
