
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,10));
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
