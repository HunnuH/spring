package task2;
public class Alcohol extends Drink{
	double alcper;
	public Alcohol() {
	}
	public double getAlcper() {
		return alcper;
	}
	public void setAlcper(double alcper) {
		this.alcper = alcper;
	}
	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	public static void printTitle() {
		System.out.println("��ǰ��(����[%])\t�ܰ�\t����\t�ݾ�");

	}
	public void printData() {
		System.out.println(name+"("+alcper+")\t"+price+"\t"+count+"\t"+getTotalPrice());
	}
}
