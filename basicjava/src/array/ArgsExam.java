package array;
public class ArgsExam {
	public static void main(String[] args) {
           double avg = 0.0;
           int total = 0;
           for (int i=0;i<args.length;i++) {
        	   total = total +Integer.parseInt(args[i]);
           }
           avg =(double)total/args.length;
           System.out.println("���� :"+total);
           System.out.println("��� :"+(total/args.length));
           System.out.println("��� :"+avg);
 	}
}
