import java.util.*;

public class consecutiveSubsequence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc =new Scanner(System.in);
	    
	    int arr[]= {15, 13, 23, 21, 19, 11, 16};
	    
	    int lon_seq[]=longestSub(arr);
	    
	    for(int a:lon_seq)
	    System.out.print(a+" ");

	}
	
	public static int [] longestSub(int arr[])
	{
		
		Arrays.sort(arr);
		
		int mod_arr[]=new int [arr.length];
		mod_arr=arr.clone();
		
		int out_arr[];
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		int j;
		
		for(int i=0;i<arr.length;)
		{
			for( j=i+1;j<arr.length;)
			{
				if(arr[j]-arr[j-1]==1)
					j++;
				else
					break;
				
			}
			
			if(j-i>arrlist.size())
			{
				arrlist.clear();
				for(int k=i;k<j;k++)
					arrlist.add(arr[k]);
			}
			
			i=j;
		}
		
		out_arr=new int [arrlist.size()];
		int z=0;
		for(int a:arrlist)
			out_arr[z++]=a;
		
		//if two arrays are of equal length return array which has index of smallest element comes before.
		if(out_arr.length==mod_arr.length)
		{
			//finding index of smallest element in each array
			int mod_small_elt=indexSmallestElmnt(mod_arr);
			int out_small_elt=indexSmallestElmnt(out_arr);
			
			if(mod_small_elt<out_small_elt)
				return mod_arr;
			else
				return out_arr;
		}
	
		return out_arr;
		
	}
	
	public static int indexSmallestElmnt(int arr[])
	{
		int index=0;
		int min=78945;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				index=i;
			}
			
		}
		
		return index;
	}

}
