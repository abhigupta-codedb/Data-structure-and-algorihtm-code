import java.util.*;
public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		quicksort(arr, 0, n-1);
		
		for(int a:arr)
			System.out.println(a+" ");
		
		sc.close();
	}
	static void quicksort(int arr[],int left,int right)
	{
		if(left<=right)
		{
			int p=partation(arr,left,right);
			quicksort(arr, left,p-1);
			quicksort(arr,p+1, right);
		}
		else
			return;

	}
	static int partation(int arr[], int left, int right) {
		// TODO Auto-generated method stub
		int pivot=arr[left];
		int smallCount=0;
		
		for(int i=left+1;i<=right;i++)
		{
			if(arr[i]<pivot)
			{
				smallCount++;
			}
		}
		int pivotIndex=left+smallCount;
		arr[left]=arr[pivotIndex];
		arr[pivotIndex]=pivot;
		
		int i=left;
		int j=right;
		
		while(i<pivotIndex||j>pivotIndex)
		{
			if(arr[i]<=arr[pivotIndex])
				i++;
			else if(arr[j]>arr[pivotIndex])
				j--;
			else
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
	}
}
