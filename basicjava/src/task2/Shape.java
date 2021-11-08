package task2;
public abstract class Shape {
	private String name;
	protected double area;
	public Shape() {
	}
	public Shape(String name) {
		super();	
		this.name = name;
		this.area = area;

	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public abstract void calculationArea();
    public void print() {
    	System.out.println(name+"의 면적은"+area);
    }
}
