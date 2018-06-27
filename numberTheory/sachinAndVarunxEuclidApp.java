package numberTheory;
import java.util.*;
public class sachinAndVarunxEuclidApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			long a=sc.nextLong();
			
			long b=sc.nextLong();
			
			long d=sc.nextLong();
			
			long g=gcd(a, b);
			
			if(d%g!=0)
			{
				System.out.println(0);
				continue;
			}
			
			else if (d==0)
			{
				System.out.println(1);
				continue;
			}
			
			a/=g;
			b/=g;
			d/=g;
			
			long y1= (d%a * modInverse(b, a))%a;
			long first_val=d/b;
			
			if(d<y1*b)
			{
				System.out.println(0);
				continue;
			}
			
			long n=(first_val-y1)/a;
			
			
			System.out.println(n+1);
		}
		
		sc.close();

	}
	
	private static Triplet2 gcd_extender(long a,long b)
	{
		Triplet2 myAns=new Triplet2();
		
		if(b==0)
		{
			myAns.gcd=a;
			myAns.x=1;
			myAns.y=0;
			
			return myAns;
		}
		
		
		Triplet2 smallAns = gcd_extender(b,a%b);

		
		
		myAns.gcd = smallAns.gcd;
		myAns.x  = smallAns.y;
		myAns.y = (smallAns.x - ((a/b)*(smallAns.y)));
		return myAns;
	}
	
	public static long modInverse(long a,long m)
	{
		long x=gcd_extender(a, m).x;
		
		return (x % m + m ) % m;	
	}
	
	private static long gcd(long a,long b) {
		// TODO Auto-generated method stub
		
		if(a<b)
			return gcd(b,a);
		
		else if(b==0)
			return a;
		
		else
			return gcd(b,a%b);
		
		
	}

}

class Triplet2
{
	long gcd;
	long x;
	long y;
}