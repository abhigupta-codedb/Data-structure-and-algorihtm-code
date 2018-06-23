import java.util.*;

public class stockSpanOrderN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    int price[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    	price[i]=sc.nextInt();
	    
	    int final_price[]=stockSpan(price);
	    
	    for(int i:final_price)
	    	System.out.print(i+" ");
	    sc.close();
	}

	private static int[] stockSpan(int[] price) {
		// TODO Auto-generated method stub
		Stack<Integer> st =new Stack<Integer>();
			st.push(0);
			
		int out_price[]=new int [price.length];
		
		out_price[0]=1;
		
		for(int i=1;i<price.length;i++)
		{
			while(!st.isEmpty()&&(price[st.peek()]<price[i]))
				st.pop();
			
			out_price[i] = (st.empty())? (i + 1) : (i - st.peek());
			 
		      
		    st.push(i);
			
		}
		
		return out_price;
	}

}
//8
//60 70 80 100 90 75 80 120