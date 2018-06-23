package stringAssignments;

import java.util.Scanner;

public class CheckAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		if(str.startsWith("a"))
		{
			str=str.substring(1);
			System.out.println(checkAB(str));
		}
		else
			System.out.println("false");
		
		sc.close();
	}

	private static boolean checkAB(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty())
			return true;
		
		else if(str.startsWith("a"))
		{
			if(str.substring(1,2).isEmpty())
				return checkAB(str.substring(1));
			
			else if(str.substring(1,2).equals("b"))
				return checkAB(str.substring(1));
			
			else
				return false;
		}
		
		else if(str.startsWith("b"))
		{
			if(str.substring(1,2).equals("b")&&str.substring(2,3).equals("a"))
				return checkAB(str.substring(2));
			
			
			else if(str.substring(1,2).equals("b")&&str.substring(2,2).isEmpty())
				return true;

			else 
				return false;
		}
		
		else
			return false;
	}



}
