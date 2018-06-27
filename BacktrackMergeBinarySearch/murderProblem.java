package BacktrackMergeBinarySearch;
import java.util.*;
public class murderProblem {
	//public static long glb_count=0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			
			for(int j=0;j<n;j++)
				arr[j]=sc.nextInt();
		
			System.out.println(murderCount(arr,0,n-1));
			
		}
		sc.close();
	}
	
	private static long murderCount(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		long count=0;
		if(right>left)
		{
			int mid=(left+right)/2;
			long count1=murderCount(arr, left,mid);
			long count2=murderCount(arr, mid+1,right);
			long mrg_count=mearge(arr,left,right);
			
			return count1+count2+mrg_count;
		}
		return count;
	}

	private static long mearge(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int i=left;
		
		int mid=(left+right)/2;
		
		int temp [] =new int[right-left+1];
		int start=0;
		int glb_count=0;
		int j=mid+1;
		int k=right;
		
		while(i<=mid && j<=k)
		{
			if(arr[i]<arr[j])
			{
				temp[start]=arr[i];
				glb_count+=(k-j+1)*arr[i];
				start++;
				i++;
			}
			else
				temp[start++]=arr[j++];
		}
		
		while(i<=mid)
		{
			temp[start++]=arr[i++];
		}
		
		while(j<=k)
		{
			temp[start++]=arr[j++];
		}
		
		for(int l=left,n=0;l<=right;)
			arr[l++]=temp[n++];
		
		//System.out.println("glb_Count "+glb_count);
		
		return glb_count;
	}

}
