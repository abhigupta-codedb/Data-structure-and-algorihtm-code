import java.util.*;

public class extractUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String n=sc.next();
		
		System.out.println(uniqueString(n));

	}

	private static String uniqueString(String n) {
		// TODO Auto-generated method stub
		String out="";
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		
		for(char a:n.toCharArray())
			lhs.add(a);
		
		Iterator<Character> itr=lhs.iterator();
		
		while(itr.hasNext())
			out=out+itr.next();
		
		return out;
	}

}
