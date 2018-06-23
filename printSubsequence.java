import java.util.Scanner;

public class printSubsequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		String out_st="";
		
		printSeq(str,out_st);
		
		sc.close();
	}

	private static void printSeq(String str, String out_str) {
		// TODO Auto-generated method stub
		if(str.length()==0)
		{
			System.out.print(out_str+" ");
			return;
		}
		
		else
		{
			printSeq(str.substring(1), out_str);
			printSeq(str.substring(1), out_str+str.charAt(0));
		}
	}
}
