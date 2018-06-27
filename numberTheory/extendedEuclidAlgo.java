package numberTheory;
import java.util.*;
public class extendedEuclidAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Triplet ans=gcd_extender(a, b);
		
		System.out.println(ans.gcd);
		System.out.println(ans.x);
		System.out.println(ans.y);
		
		sc.close();
	}

	private static int gcd(int a, int b) 
	{
		// TODO Auto-generated method stub
		
		if(a<b)
			return gcd(b,a);
		
		else if(b==0)
			return a;
		
		else
			return gcd(b,a%b);
		
	}
	
	private static Triplet gcd_extender(int a,int b)
	{
		Triplet myAns=new Triplet();
		
		if(b==0)
		{
			myAns.gcd=a;
			myAns.x=1;
			myAns.y=0;
			
			return myAns;
		}
		
		
		Triplet smallAns = gcd_extender(b,a%b);

		
		
		myAns.gcd = smallAns.gcd;
		myAns.x  = smallAns.y;
		myAns.y = (smallAns.x - ((a/b)*(smallAns.y)));
		return myAns;
	}

}

class Triplet
{
	int gcd;
	int x;
	int y;

}