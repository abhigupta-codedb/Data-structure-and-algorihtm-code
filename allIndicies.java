import java.util.*;

public class allIndicies {
	
	public static ArrayList<Integer> gl_arlist= new ArrayList<Integer>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int k=sc.nextInt();
		
		for(int a:allIndexes(arr, k))
			System.out.print(a+" ");
		sc.close();
	}
	
	public static int[] allIndexes(int input[], int x) {

		ArrayList<Integer> arlist=findNum(input, 0, x);
		int arr[]=new int [arlist.size()];
		
		int j=0;
		for(int a:arlist)
			arr[j++]=a;
		
		return arr;
				
	}
	
	private static ArrayList<Integer> findNum(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		if(n>=arr.length)
		{
			return gl_arlist;
		}
		
		else if(k==arr[n])
			gl_arlist.add(n);
		
		
		return findNum(arr, n+1, k);
			
	}
}
