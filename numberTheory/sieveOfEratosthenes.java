package numberTheory;
import java.util.*;
public class sieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextLong();
		
		boolean arr[]=new boolean[(int)n+1];
		
		for(int i=0;i<=n;i++)
			arr[i]=true;
		
		arr[0]=false;
		arr[1]=false;
		
		int j=2;
		
		while(j<=(int)Math.ceil(Math.sqrt(n)))
		{
			int num=j;
			
			if(arr[num]==false)
				j++;
			
			else
			{
				int pos=num*num;
				int inc=num;
				while(pos<=n )
				{
					arr[pos]=false;
					inc++;
					pos=num*inc;
				}
				
				j++;
			}
			
		}
		
//		List<Integer> list=new ArrayList<Integer>();
		int count=0;
		
		for(int i=2;i<=n;i++)
		{
			if(arr[i]==true)
				count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
