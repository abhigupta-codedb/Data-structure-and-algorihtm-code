import java.util.Scanner;

public class lastIndex {
	
	public static int gb_value=-567;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int k=sc.nextInt();
		
		System.out.println(lastIndex(arr, k));
		sc.close();	
	}

	private static int lastIndex(int input[], int x) {
		// TODO Auto-generated method stub
		
		return checkNum2(input,0,x);
	}

	private static int checkNum2(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		if(n>=arr.length)
		{
			if(gb_value==-567)
				return -1;
			else
				return gb_value;
		}
		
		else if(k==arr[n])
			gb_value=n;
		
		
		return checkNum2(arr, n+1, k);
			
	}
}
