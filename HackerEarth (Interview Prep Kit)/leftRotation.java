package Arrays;
import java.util.*;
public class leftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int d=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int out[]=leftRot(arr,n,d);
		
		for(int a:out)
			System.out.print(a+" ");
		
		sc.close();
	}
	
	
	public static int [] leftRot(int arr[],int n,int d)
	{
		int temp=0;
		
		while(d>0)
		{
			
			temp=arr[0];
			
			for(int i=1;i<n;i++)
				arr[i-1]=arr[i];
			
			arr[n-1]=temp;
			
			d--;
		}
		
		
		return arr;
	}

}
