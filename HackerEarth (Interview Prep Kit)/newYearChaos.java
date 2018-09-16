package Arrays;
import java.util.Scanner;
public class newYearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int test=sc.nextInt();
		
		while(test>0)
		{
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			minSwaps(arr,n);
			
			test--;
		}
		
		sc.close();
	}
	
	
	public static void minSwaps(int input[],int n)
	{
		
		
		
	}

}
