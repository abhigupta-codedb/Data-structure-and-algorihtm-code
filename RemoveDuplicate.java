import java.util.*;
import java.util.Scanner;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc =new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    
	    for(int i=0;i<n;i++)
	    	arr[i]=sc.nextInt();
	    
	    int final_arr[]=Remv_Dupl(arr);
	    
	    for(int i:final_arr)
	    	System.out.print(i+" ");
	    sc.close();
	}
	
	public static int[] Remv_Dupl(int arr[]) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrList= new ArrayList<Integer>();
      	
      	for(int i=0;i<arr.length;i++)
        {
      	  int temp=arr[i];
      	  
          if(!arrList.contains(temp))
        	  arrList.add(temp);
        }
      	
      	if(!arrList.isEmpty())
	      	{
		      	int output_arr[]=new int[arrList.size()];
		      	
//		      	Iterator<Integer> iterator=arrList.iterator();
//		      	int i=0;
//		      	
//		      	while(iterator.hasNext())
//		      	{
//		      		output_arr[i++]=iterator.next();
//		      	}
		      	
		      	int j=0;
		      	for(Integer i:arrList)
		      		output_arr[j++]=i;
		      	
		      	return output_arr;
	      	
	      	}
      	
      	else
      		return null;
		
	}

}
