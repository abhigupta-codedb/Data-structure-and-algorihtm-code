package Arrays;
import java.util.*;
public class eliminateAlternate {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int input[] =new int[n];
		
		for(int i=0;i<n;i++)
			input[i]=sc.nextInt();
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int a:input)
			ar.add(a);
		
		Iterator<Integer> itr=ar.iterator();
		
		while(itr.hasNext()!=false)
		{
			
		}
		
		sc.close();
	}
}
