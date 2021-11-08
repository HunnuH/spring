package array;
public class ArgsExam02 {
	public static void main(String[] args) {
		int myarr = 0;
		
        for(int i=0;i<args.length;i++) {
	    	if(Integer.parseInt(args[i])%2==0){	   
	     System.out.println((i+1)+ ":" +args[i]+" > Â¦¼ö");
	    } else {
	     System.out.println((i+1)+ ":" +args[i]+" > È¦¼ö");
	    }
	  }
	}
}
