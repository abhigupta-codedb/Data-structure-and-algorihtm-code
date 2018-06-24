import java.util.*;

public class CheckAB2 {

	public static boolean val=false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();//abbaabb
		String prev=null;
		
		if(str.startsWith("a"))
		{
			str=str.substring(1);//bbaabb
			prev="a";
			System.out.println(checkAB(str,prev));
		}
		else
			System.out.println("false");
		
		sc.close();
	}

	private static boolean checkAB(String str,String prev) //bbaabb,a|aabb,bb|abb,a|bb,a
	{
		// TODO Auto-generated method stub
		if(str.isEmpty())
		{
			val=true;
			return val;
		}
		
		else if(prev.equals("a"))
		{
			
			if(str.substring(0,1).equals("a"))
			{
				prev="a";
				checkAB(str.substring(1), prev);//bb,a		
			}
			
			else if(str.substring(0,2).equals("bb"))
			{
				prev="bb";
				checkAB(str.substring(2), prev);//aabb,bb|empty,bb		
			}
			
			else
			{
				val=false;
				return val;
			}
		}
		
		else if(prev.equals("bb"))//aabb,bb
		{
			
			if(str.substring(0,1).equals("a"))
			{
				prev="a";
				checkAB(str.substring(1), prev);//abb,a
			}
			
			else
			{
				val=false;
				return val;
			}
		}
		
		return val;
		
	}

}
