package BacktrackMergeBinarySearch;

import java.util.*;

public class distributeCandy {

	public static long val=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			long k=sc.nextLong();
			
			long arr[]=new long[n];
			for(int j=0;j<n;j++)
				arr[j]=sc.nextLong();
		
			
			long maxval=arr[0];
			for(int l=1;l<n;l++)
			{
				if(arr[l]>maxval)
					maxval=arr[l];
			}
			
			System.out.println(distribute(arr,0,maxval,k));
			
		}
		sc.close();
	}

	private static long distribute(long[] arr, long min, long max, long k) {
		// TODO Auto-generated method stub

		long stu_count=0;
		
		if(max>=min)
		{
			long mid=(max+min)/2;
			
			for(long a:arr)
			{
				stu_count+=(a/mid);
			}
			
			if(stu_count>=k)
			{
				val=mid;
				distribute(arr, mid+1, max, k);
			}
			
			else
				distribute(arr, min, mid-1, k);
		}
		
		 return val;
	}

}
