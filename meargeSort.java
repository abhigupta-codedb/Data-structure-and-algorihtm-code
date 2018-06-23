import java.util.Scanner;

public class meargeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		meargesort(arr);
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
		sc.close();

	}

	public static void meargesort(int[] input) {
		// TODO Auto-generated method stub
		if(input.length==1)
		{
			return;
		}
		int mid=input.length/2;
		int part1[]=new int[mid];
		int part2[]=new int[input.length-mid];
		
		
		for(int i=0;i<mid;i++)
			part1[i]=input[i];
		
		int k=0;
		for(int i=mid;i<input.length;i++)
			part2[k++]=input[i];
		
		meargesort(part1);
		meargesort(part2);
		mearge(part1, part2,input);
			
	}

	private static void mearge(int[] part1, int [] part2, int [] output) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		while( i<part1.length&&j<part2.length)
		{
			if(part1[i]<part2[j])
				output[k++]=part1[i++];
			
			else
				output[k++]=part2[j++];
		}
		
		while(i<part1.length)
		{
			output[k++]=part1[i++];
		}
		
		while(j<part2.length)
		{
			output[k++]=part2[j++];
		}
		
	}

}
