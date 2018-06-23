package stringAssignments;

import java.util.*;

public class ReturnsubsetToK {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int k=sc.nextInt();
		
		List<List <Integer>> out_List=Subset(arr,k);
		
//		System.out.println(out_List.size());
		
		int twodarr[][]=new int[out_List.size()][];
		
		for(int i=0;i<out_List.size();i++)
		{
			int innListSize=out_List.get(i).size();
			twodarr[i]=new int [innListSize];
			List<Integer> temp=new ArrayList<Integer>(out_List.get(i));
			for(int j=0;j<innListSize;j++)
				twodarr[i][j]=temp.get(j);
		}
		
		
//		Putting List<List<Integer>> inside a Jagged Array and printing it.
		for(int i=0;i<twodarr.length;i++) {
			
			for(int j=0;j<twodarr[i].length;j++)
				System.out.print(twodarr[i][j]);
			
			System.out.println();
		
		}
		
//		for(List<Integer> a:out_List)
//			System.out.println(a);
		
		sc.close();
			
	}

	private static List<List <Integer>> Subset(int[] arr,int k) {
		// TODO Auto-generated method stub
		
		List<List <Integer>> list=new ArrayList<List <Integer>>();
		list.add(new ArrayList<Integer>());//Adding empty list to output list
		
		for(int a:arr)
		{
			int size=list.size();
			
			for(int j=0;j<size;j++)
			{
				List<Integer> temp=new ArrayList<Integer>(list.get(j));
				temp.add(a);
				{
					int sum=0;
					for(int s:temp)
						sum+=s;
					if(sum<=k)
						list.add(temp);
				}
				
			}
		}
		
		
		List<Integer> rem_index=new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++)
		{
			List<Integer> temp=list.get(i);
			
			if(!temp.isEmpty())
			{
				int sum=0;
				for(int a:temp)
					sum+=a;
				if(sum==k)
					rem_index.add(i);
			}
		}
		
		List<List <Integer>> send_list=new ArrayList<List <Integer>>();
		
		for(int a:rem_index)
		{
			List<Integer> temp=list.get(a);
			send_list.add(temp);
		}
		
		//System.out.println(send_list.toString());
		
		return send_list;
	}
}
