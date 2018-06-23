package stringAssignments;
import java.util.*;
public class Nsteps {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(stairCase(n));
		
		sc.close();
	}

	private static int stairCase(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3)
			return 4;
		else if(n==4)
			return 7;
		else
			return stairCase(n-1)+stairCase(n-2)+stairCase(n-3);
		
	}
	

}
