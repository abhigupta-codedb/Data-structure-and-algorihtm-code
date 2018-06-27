package numberTheory;
import java.util.Scanner;
public class euclidGCDAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(gcd(a,b));
		
		sc.close();
	}

	private static int gcd(int a,int b) {
		// TODO Auto-generated method stub
		
		if(a<b)
			return gcd(b,a);
		
		else if(b==0)
			return a;
		
		else
			return gcd(b,a%b);
		
		
	}

}
