import java.util.Scanner;

public class printKeypadCode {
	
	public static String arr[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		String out_st="";
		
		printSeq(n,out_st);
		
		sc.close();
	}

	private static void printSeq(int n, String out_str) {
		// TODO Auto-generated method stub
		if(n==0||n==1)
		{
			System.out.println(out_str);
			return;
		}
		
		else
		{
			int str_int=n%10;
			int shr_int=n/10;
			String str_int_strg=arr[str_int];
			if(str_int_strg.length()==3)
			{
				printSeq(shr_int,str_int_strg.charAt(0)+out_str);
				printSeq(shr_int,str_int_strg.charAt(1)+out_str);
				printSeq(shr_int,str_int_strg.charAt(2)+out_str);
			}
			
			else if(str_int_strg.length()==4)
			{
				printSeq(shr_int,str_int_strg.charAt(0)+out_str);
				printSeq(shr_int,str_int_strg.charAt(1)+out_str);
				printSeq(shr_int,str_int_strg.charAt(2)+out_str);
				printSeq(shr_int,str_int_strg.charAt(3)+out_str);
			}

		}
	}
}
