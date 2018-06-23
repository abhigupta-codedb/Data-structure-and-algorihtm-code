package stringAssignments;

import java.util.*;

public class subsetOfArrNonRecr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		List<List <Integer>> out_List=Subset(arr);
		
		System.out.println(out_List.size());
		
		int twodarr[][]=new int[out_List.size()][];
		
		//Putting List<List<Integer>> inside a Jagged Array and printing it.
		for(int i=0;i<out_List.size();i++)
		{
			int innListSize=out_List.get(i).size();
			twodarr[i]=new int [innListSize];
			List<Integer> temp=new ArrayList<Integer>(out_List.get(i));
			for(int j=0;j<innListSize;j++)
				twodarr[i][j]=temp.get(j);
		}
		
		
		
		for(int i=0;i<twodarr.length;i++) {
			
			for(int j=0;j<twodarr[i].length;j++)
				System.out.print(twodarr[i][j]);
			
			System.out.println();
		
		}
		
		sc.close();
			
	}

	private static List<List <Integer>> Subset(int[] arr) {
		// TODO Auto-generated method stub
		
		List<List <Integer>> list=new ArrayList<List <Integer>>();
		list.add(new ArrayList<Integer>());
		
		for(int a:arr)
		{
			int size=list.size();
			
			for(int j=0;j<size;j++)
			{
				List<Integer> temp=new ArrayList<Integer>(list.get(j));
				temp.add(a);
				list.add(temp);
			}
		}
		
		return list;
	}
} 