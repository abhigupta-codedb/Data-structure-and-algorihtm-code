import java.util.*;

public class returnKeypadCode {

	public static String arr[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int t=n;
		int size=1;
		
		while(t!=0)
		{
			int u=t%10;
			t=t/10;
			size*=arr[u].length();
		}
		
		String out[]= new String[size];
		
		System.out.println(Subseq(n, out));
		
		for(String a:out)
			System.out.println(a);
		
		sc.close();

	}

	public static int Subseq(int num,String output[])
	{
		if(num>=0 && num<=9)
		{
			String str=arr[num];
			
			for(int i=0;i<str.length();i++)
				output[i]=str.charAt(i)+"";
			
			return str.length();
		}
		
		else
		{
			int small_int=num/10;
			int str_int=num%10;
			
			int arr_size=Subseq(small_int, output);
			String str_arr=arr[str_int];
			
			
			//creating copies no. of times a len(String)
			int n=0;
			for(int j=0;j<str_arr.length()-1;j++)
			{
				for(int k=0;k<arr_size;k++)
				{
					output[arr_size+n]=output[k];
					n++;
				}

			}
						
			int nvr_stop=0;
			for(int j=0;j<str_arr.length();j++)
			{
				for(int l=0;l<arr_size;l++) 
				{
					output[nvr_stop]=output[nvr_stop]+str_arr.charAt(j);
					nvr_stop++;
				}

			}
			
			return str_arr.length()*arr_size;
		}
	}
	
	

}
