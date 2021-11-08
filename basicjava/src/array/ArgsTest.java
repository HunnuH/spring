package array;
public class ArgsTest {
	public static void main(String[] args) {
	 	 System.out.println("명령형 매개변수 개수:"+args.length);
         System.out.println("user ip :"+args[0]);
         System.out.println("user port :"+args[1]);
         
         System.out.println(Integer.parseInt(args[2])+Integer.parseInt(args[3]));
	}
}
