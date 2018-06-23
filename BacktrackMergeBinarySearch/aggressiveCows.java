package BacktrackMergeBinarySearch;
import java.util.*;
public class aggressiveCows {
	
	public static int max_dis;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			max_dis=0;
			int n=sc.nextInt();
			int c=sc.nextInt();
			
			int arr[]=new int [n];
			
			for(int j=0;j<n;j++)
				arr[j]=sc.nextInt();
			
			Arrays.sort(arr);
			
			findLargestDist(arr,c,arr[0],arr[n-1]);
			
			System.out.println("max_dis "+max_dis);
		}
		
		sc.close();
	}

	private static void findLargestDist(int[] arr,int c,int min,int max) {
		// TODO Auto-generated method stub
		if(min<max)
		{
		int mid_dis=(max+min)/2;
		Stack<Integer> stk=new Stack<Integer>();
		int cow_count=0;
		
		for(int a:arr)
		{
			if(cow_count==c)
			{
				break;
			}
			
			else if(stk.isEmpty())
			{
				stk.push(a);
				cow_count++;
			}
			
			else
			{
				int element=stk.pop();
				if(a-element>=mid_dis)
				{
					stk.push(element);
					stk.push(a);
					cow_count++;
				}
				else
					stk.push(element);
			}
			
			//System.out.println("max_dis "+max_dis);
		}
		
		if(stk.size()==c)
		{
			if(mid_dis>max_dis)
				max_dis=mid_dis;
			
			findLargestDist(arr,c,mid_dis+1, max);
		}
		
		else
			findLargestDist(arr,c,min,mid_dis);
			
		}
		
		else
			return;

	}

}
