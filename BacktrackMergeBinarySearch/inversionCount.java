package BacktrackMergeBinarySearch;
import java.util.*;
public class inversionCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(inversion(arr,0,arr.length-1));
		
		sc.close();

	}

	private static long inversion(int[] arr, int left,int right) {
		long count=0;
		if(left<right)
		{
			int mid=left+right/2;
			long count1=inversion(arr, left,mid);
			long count2=inversion(arr, mid+1,right);
			long mrg_count=merge(arr,left,mid+1,right);
			
			return count1+count2+mrg_count;
		}
		
		return count;
	}

	private static long merge(int[] arr, int start, int mid,int end) {
		// TODO Auto-generated method stub
		int i=start,j=mid;
		int temp[]=new int[end-start+1];
		int k=0;
		long count=0;
		
		while(i<mid && j<=end)
		{
			if(arr[i]<arr[j])
				temp[k++]=arr[i++];
			else
			{
				temp[k++]=arr[j++];
				count+=mid-i;
			}
		}
		
		while(i<mid)
			temp[k++]=arr[i++];
		
		while(j<=end)
			temp[k++]=arr[j++];
		
		for(int m=start,l=0;m<end;m++,l++)
			arr[start++]=temp[l++];
			
		
		return count;
	}

}
