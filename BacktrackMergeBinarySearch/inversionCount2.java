package BacktrackMergeBinarySearch;

import java.util.Scanner;

public class inversionCount2 {

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

	private static long inversion(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		long count=0;
		if(right>left)
		{
			int mid=(left+right)/2;
			long inv1=inversion(arr, left,mid);
			long inv2=inversion(arr, mid+1,right);
			long mrg_inv=mearge(arr,left,right);
			
			return inv1+inv2+mrg_inv;
		}
		return count;
	}

	private static long mearge(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int i=left;
		
		int mid=(left+right)/2;
		
		int temp [] =new int[right-left+1];
		int start=0;
		
		int j=mid+1;
		int k=right;
		long inv_count=0;
		
		
		while(i<=mid && j<=k)
		{
			if(arr[j]<arr[i])
			{
				temp[start++]=arr[j++];
				inv_count+=mid-i+1;
			}
			else
				temp[start++]=arr[i++];
		}
		
		while(i<=mid)
		{
			temp[start++]=arr[i++];
		}
		
		while(j<=k)
		{
			temp[start++]=arr[j++];
		}
		
//		System.out.println("temp ");
//		for(int a:temp)
//			System.out.print(a+" ");
//		
//		System.out.println();
		
		for(int l=left,n=0;l<=right;)
			arr[l++]=temp[n++];
		
//		System.out.println("arr ");
//		for(int a:arr)
//			System.out.print(a+" ");
//		
//		System.out.println("inv_count ");
//		
//		System.out.println(inv_count);
		
		return inv_count;
	}

}
