package DP;
import java.util.*;
public class BasicDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(fibCal2(n));
		
//		int arr[]=new int[n+1];
//		
//		arr[0]=arr[1]=1;
//		
//		System.out.println(fibCal(n,arr));
	}

	private static int fibCal(int n, int[] arr) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
			return arr[n];
		
		int out=fibCal(n-1, arr)+fibCal(n-2, arr);
		arr[n]=out;
		return arr[n];
	}
	
	private static int fibCal2(int n) {
		// TODO Auto-generated method stub
		int arr[]=new int[n+1];
		arr[0]=arr[1]=1;
		
		if(n==0||n==1)
			return arr[n];
		
		for(int i=2;i<=n;i++)
			arr[i]=arr[i-1]+arr[i-2];
		
		return arr[n];
	}
	
}
