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
		return "���������� : "+owner+" \n�������� : ������ "+price+"�Դϴ�."; 
	}
	public boolean equals(Object obj){
		if(obj!=null & obj instanceof Vehicle){
			Vehicle o = (Vehicle)obj;
			if(this.owner.equals(o.getOwner())){
				return true;//��ġ�Ѵ�.
			}
		}
		return false;
	}
}
