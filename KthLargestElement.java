import java.util.*;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    	arr[i]=sc.nextInt();
	    
	    int k=sc.nextInt();
	    
	    System.out.println(KthLargest(arr,k));
	}

	private static int KthLargest(int[] arr, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		
		return arr[arr.length-k];
	}

}
