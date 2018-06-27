package numberTheory;
import java.util.*;
public class numOfBalancedBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int h=sc.nextInt();
		
		long count=blancedTrees(h);
		
		long m=(long)Math.pow(10, 9)+7;
		
		int ans=(int) (count%m);
		
		System.out.println("count "+count);
		
		sc.close();

	}

	private static int blancedTrees(int h) {
		// TODO Auto-generated method stub
		
		if(h==0)
			return 1;
		else if(h==1)
			return 1;
		else
		{
			long x=blancedTrees(h-1);
			long y=blancedTrees(h-2);
			
			int m=(int)Math.pow(10,9)+7;
			
			long val1=x*x;
			long val2=2*x*y;
			
//			int res1=(int)(val1%m);
//			int res2=(int)(val2%m);
//			
			
			return (int)(val1+val2)%m;
		}
		
	}

}
