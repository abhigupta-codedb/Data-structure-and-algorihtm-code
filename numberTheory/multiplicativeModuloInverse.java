package numberTheory;

import java.util.Scanner;

public class multiplicativeModuloInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(modInverse(a, b));
		
		sc.close();

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
	
	public static int modInverse(int a,int b)
	{
		Triplet ans=gcd_extender(a, b);
		
		return ans.x;
	}

}




