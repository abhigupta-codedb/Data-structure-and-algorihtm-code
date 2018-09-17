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
		
		System.out.println("final value "+maxVal(input, n));
		
		sc.close();
	}
	
	private static int maxVal(int arr[],int n)
	{
		int val=0;
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
	    for(int a :arr)
	    	ar.add(a);
	    
	    while(ar.size()>1)
	    {
	    	Iterator<Integer> itr=ar.iterator();
	    	
	    	int i=0;
	    	
	    	while(itr.hasNext())
	    	{
	    		itr.next();
	    		if(i%2==0)
	    		{
	    			itr.remove();;
	    			
	    		}
	    		i++;
	    	}
	    	
	    	Collections.reverse(ar);
//	    	for(int a :ar)
//	    		System.out.print(a+" ");
	    }
		
	    for(int a :ar)
	    	val=a;
	    
		return val;
		
	}
}
