package inheritance;
public class StaticDemo {
	int num;
	static int staticnum;
	public StaticDemo() {
		num++;
		staticnum++;
		
	}
    public void display() {
    	System.out.println ("num="+num+ ", static="+staticnum);
    }
}
