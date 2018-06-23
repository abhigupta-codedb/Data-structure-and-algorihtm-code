import java.util.*;

public class NonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc =new Scanner(System.in);
	    
	    String n=sc.next();
	    
	    char c=Non_rep(n);
	    
	    System.out.print(c+" ");

	}
	
	public static char Non_rep(String str) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> str_arr= new ArrayList<String>();
      	
		char char_arr[]=str.toCharArray();
		
		for(int i=0;i<char_arr.length;i++)
		{
			char temp=char_arr[i];
			boolean flag=true;
			
			for(int j=i+1;j<char_arr.length;j++)
			{
				if(char_arr[j]==temp)
				{
					flag=false;
					break;
				}
				
			}
			
			if(flag==true)
				return temp;
			
		}
		
		
      	return char_arr[0];
		
	}
}
