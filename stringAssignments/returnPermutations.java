package stringAssignments;
import java.util.*;
public class returnPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		List<String> list=getPerm(str);
		
		for(String s:list)
			System.out.println(s);
		
		sc.close();

	}

	private static List<String> getPerm(String str) {
		// TODO Auto-generated method stub
		if(str.length()==1)
		{
			List<String> list=new ArrayList<String>();
			list.add(str);
			
			return list;
		}
		
		else
		{
			List<String> list2=getPerm(str.substring(1));
			String val=str.substring(0,1);
			
			return merge(list2, val);
		}
		
		
	}
	
	public static ArrayList<String> merge(List<String> list, String c) {
	    ArrayList<String> res = new ArrayList<>();
	    // Loop through all the string in the list
	    for (String s : list) {
	        // For each string, insert the last character to all possible positions
	        // and add them to the new list
	    	
	        for (int i = 0; i <= s.length(); ++i) {
	            String ps = new StringBuffer(s).insert(i, c).toString();
	            res.add(ps);
	        }
	    }
	    return res;
	}

}
