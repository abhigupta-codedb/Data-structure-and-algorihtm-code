import java.util.Scanner;

public class RecursiveFindNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int k=sc.nextInt();
		
		System.out.println(checkNum(arr,k));
		sc.close();
	}

	private static boolean checkNum(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n=arr.length;
		
		return checkNum2(arr,n,k);
	}

	private static boolean checkNum2(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		if(n<=0)
			return false;
		
		else if(arr[n-1]==k)
			return true;
		
		else
			return checkNum2(arr,n-1,k);
	}

}
