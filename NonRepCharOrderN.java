import java.util.*;

public class NonRepCharOrderN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc =new Scanner(System.in);
	    
	    String n=sc.next();
	    
	    char c=Non_rep(n);
	    
	    System.out.print(c+" ");

	}
	
	public static char Non_rep(String str) {
		// TODO Auto-generated method stub
		
//		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
//		
//		for(char a:str.toCharArray())
//		{
//			String temp=a+"";
//			
//			if(!hmap.containsKey(a))
//				hmap.put(temp,1);
//			
//			else
//				hmap.put(temp,hmap.get(temp)+1);
//		}
//		
//		for (Map.Entry<String,Integer> entry : hmap.entrySet()) {
//		    System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
		
//		Hashtable<Character,Integer> ht=new Hashtable<Character,Integer>();
//		
//		for(char a:str.toCharArray())
//		{
//			
//			if(!ht.containsKey(a))
//				ht.put(a,1);
//			else
//				ht.put(a,ht.get(a)+1);
//			
//		}
//		
//		System.out.println(ht.toString());
		
		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
		
		for(char a:str.toCharArray())
			{
				
				if(!lhm.containsKey(a))
					lhm.put(a,1);
				else
					lhm.put(a,lhm.get(a)+1);
				
			}
		
		
		
		for (Map.Entry<Character,Integer> entry : lhm.entrySet()) 
		{
			if(entry.getValue()==1)
				return entry.getKey();
		}
		
      	return str.charAt(0);
		
	}

}
