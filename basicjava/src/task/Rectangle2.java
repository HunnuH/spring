package task;
public class Rectangle2 {
	private int width;
	private int length;
	private String color;

	public Rectangle2() {
		length = 0;
		width = 0;
		color = "";
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getWidth() {
		return width;
	}
	public void setLength(int newLength) {
		this.length = newLength;
	}
	public int getLength() {
		return length;
	}
	public int area() {
		return length * width;
	}
	public int perimeter() {
		return 2 * (length + width);
	}
	public void setColor(String newColor) {
		this.color = newColor;
	}
	public String getColor() {
		return color;
	}
}
