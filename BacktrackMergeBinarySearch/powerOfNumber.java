package BacktrackMergeBinarySearch;
import java.util.*;
public class powerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int x=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println(power(x,n));
	}

	private static int power(int x, int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return x;
		
		else
        {
          int smal_ans=power(x,n/2);
          
          if(n%2==0)
            return smal_ans*smal_ans;
          else
            return x*smal_ans*smal_ans;
        	
        }
			
	}

}
