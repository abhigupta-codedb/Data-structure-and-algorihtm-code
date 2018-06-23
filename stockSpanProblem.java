import java.util.Scanner;

public class stockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    	arr[i]=sc.nextInt();
	    
	    int final_arr[]=stockSpan(arr);
	    
	    for(int i:final_arr)
	    	System.out.print(i+" ");
	}

	private static int[] stockSpan(int[] arr) {
		// TODO Auto-generated method stub
		int out_arr[]=new int [arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			int num=arr[i];
			for(int j=i;j>=0;j--)
			{
				if(arr[j]<num)
					count++;
				else if(arr[j]>=num)
					break;
			}
			
			if(count==0)
				count=1;
			
			out_arr[k++]=count;
			
		}
		return out_arr;
	}

}
