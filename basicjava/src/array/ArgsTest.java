package array;
public class ArgsTest {
	public static void main(String[] args) {
	 	 System.out.println("����� �Ű����� ����:"+args.length);
         System.out.println("user ip :"+args[0]);
         System.out.println("user port :"+args[1]);
         
         System.out.println(Integer.parseInt(args[2])+Integer.parseInt(args[3]));
	}
}
