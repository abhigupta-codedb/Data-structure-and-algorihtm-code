package stringAssignments;

import java.util.Scanner;

public class subsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int darr[][]=subsets(arr,0);
		
		for(int i=0;i<darr.length;i++) {
			
			for(int j=0;j<darr[i].length;j++)
				System.out.print(darr[i][j]);
			
			System.out.println();	
		}
		
		sc.close();
			
	}

	private static int[][] subsets(int[] arr,int start) {
		// TODO Auto-generated method stub
		//
		if(start==arr.length)
		{
			int output[][]=new int[1][];
			return output;
		}
		
		int [][]smallOutput=subsets(arr, start+1);
		int [][] output=new int[2*smallOutput.length][];
		
		int k=0;
		for(int i=0;i<smallOutput.length;i++)
		{
			output[k]=new int[smallOutput[i].length];
			for(int j=0;j<smallOutput[i].length;j++)
				output[k][j]=smallOutput[i][j];
			
			k++;
		}
		
		for(int i=0;i<smallOutput.length;i++)
		{
			output[k]=new int[smallOutput[i].length+1];
			output[k][0]=arr[start];
			for(int j=1;j<smallOutput[i].length;j++)
				output[k][j]=smallOutput[i][j-1];
			
			k++;
		}
			
		return output;
	}

}
