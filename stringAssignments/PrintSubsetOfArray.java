package stringAssignments;

import java.util.*;

public class PrintSubsetOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int out_arr[] = new int[0];
		
		//System.out.println(stairCase(arr));
		stairCase(arr, 0, out_arr);
		
		sc.close();
			
	}

	private static void stairCase(int[] arr,int start,int[] out_arr) {
		// TODO Auto-generated method stub
		if(start==arr.length)
		{
			for(int a:out_arr)
			System.out.print(a+" ");
			
			System.out.println();
			return;
		}
		
		stairCase(arr, start+1, out_arr);//element not included
		
		int new_arr[] = new int[out_arr.length+1];
		int i=0;
		for(;i<out_arr.length;i++)
			new_arr[i]=out_arr[i];
		
		new_arr[i]=arr[start];
		
		stairCase(arr, start+1,new_arr);
	}
}
