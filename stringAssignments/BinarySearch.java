package stringAssignments;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    	arr[i]=sc.nextInt();
	    
	    int k=sc.nextInt();
	    
	    System.out.println(binarySearch(arr,0,arr.length-1,k));
	}

	private static int binarySearch(int[] arr, int start, int end, int k) {
		// TODO Auto-generated method stub
		if(start>end)
			return -1;
		else
		{
			int mid=(start+end)/2;
			
			if(arr[mid]==k)
				return mid;
			else if(arr[mid]>k)
				end=mid-1;
			else
				start=mid+1;
		}
			
			return binarySearch(arr, start, end, k);
	}

}
