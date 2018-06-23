import java.util.*;
public class subSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		String out[]=new String[(int) Math.pow(2,n)];
		
		System.out.println(Subseq(str,out));
		
		for(String a:out)
			System.out.println(a);
		sc.close();
	}
	
	public static int Subseq(String str,String output[])
	{
		if(str.isEmpty())
		{
			output[0]="";
			return 1;
		}
		
		else
		{
			String small_str=str.substring(1);
			int arr_size=Subseq(small_str, output);
			
			for(int i=0;i<arr_size;i++)
				output[i+arr_size]=str.charAt(0)+output[i];
			
			return 2*arr_size;
		}
	}

}
