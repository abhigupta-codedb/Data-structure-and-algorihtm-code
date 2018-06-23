import java.util.*;

public class removeDuplicateRecr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		
		//System.out.println();
		removeDuplicates(str);
		
		sc.close();
	}

	public static void removeDuplicates(String str) {
		char ch[]=str.toCharArray();
		String out_str="";
		
		Stack<Character> stk=new Stack<Character>();
		stk.push(ch[0]);
		
		for(int i=1;i<ch.length;i++)
		{
			if(stk.peek()==ch[i])
				stk.pop();
			
			stk.push(ch[i]);
		}
		
		while(!stk.empty())
		{
			out_str+=stk.pop();
		}
		
		StringBuilder sbr=new StringBuilder();
		sbr.append(out_str);
		
		sbr=sbr.reverse();
		
		System.out.println(sbr.toString());
	}
	


}
