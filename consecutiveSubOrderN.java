import java.util.*;

public class consecutiveSubOrderN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	    
	    int arr[]= {2, 12, 9, 16, 10, 5,3, 20, 25, 11, 1, 8, 6 };
	    //{2, 12, 9, 16, 10, 5,3, 20, 25, 11, 1, 8, 6 }
	    //{15, 13, 23, 21, 19, 11, 16}
	    ArrayList<Integer> lon_seq=longestSub(arr);
	    
	    for(int a:lon_seq)
	    System.out.print(a+" ");
	    sc.close();
	}

//	@SuppressWarnings("unchecked")
	private static ArrayList<Integer> longestSub(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		ArrayList<Integer> outarrlist=new ArrayList<Integer>();
		
		for(int a:arr)
			set.add(a);
		
		for(int i=0;i<set.size();i++)
		{
			arrlist.clear();
			while(!set.contains(arr[i]-1))
			{
				int j=arr[i];
				
				while(set.contains(j))
				{
					arrlist.add(j);
					j++;
				}
				
				if(arrlist.size()>outarrlist.size())
				{
					outarrlist.clear();
					outarrlist= (ArrayList<Integer>)arrlist.clone();
				}
				
				break;
			}
		}
		
		return outarrlist;
	}

}
