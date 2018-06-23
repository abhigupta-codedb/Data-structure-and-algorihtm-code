import java.util.*;
public class RecursiveArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println(arrSum(arr,n));
		sc.close();
			
	}

	private static int arrSum(int input[],int n) {
		// TODO Auto-generated method stub
		System.out.println(n);
		if(n<=0)
			return 0;
		
		else
			return input[n-1]+arrSum(input, n-1);
	}

}
