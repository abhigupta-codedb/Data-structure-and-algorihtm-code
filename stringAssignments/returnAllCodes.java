package stringAssignments;
import java.util.*;
public class returnAllCodes {
	
	public static final char []ch= {'\0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		
		String []str_arr=getCode(str);
		
		for(String s:str_arr)
			System.out.println(s);
		
		sc.close();
	}

	public  static String[] getCode(String str) {
		// TODO Auto-generated method stub
		String shr_str2[]=new String[0];
		
		 if(str.length()==1)
		{
			String out_str[]=new String [1];
			out_str[0]=ch[Integer.parseInt(str.substring(0,1))]+"";
			
			return out_str;
		}
		
		else if(Integer.parseInt(str)>=10 && Integer.parseInt(str)<=26)
		{
			//System.out.println(str);
			String out_str[]=new String[2];
			
			out_str[0]=ch[Integer.parseInt(str.substring(0,1))]+""+ch[Integer.parseInt(str.substring(1,2))];
			out_str[1]=ch[Integer.parseInt(str.substring(0,2))]+"";	
			
			return out_str;
		}
		
		else
		{
			String shr_str1[]=getCode(str.substring(1));
			
			for(int i=0;i<shr_str1.length;i++)
			{
				shr_str1[i]=ch[Integer.parseInt(str.substring(0,1))]+""+shr_str1[i];
			}
			
			if(Integer.parseInt(str.substring(0,2))>=10 && Integer.parseInt(str.substring(0,2))<=26)
			{
				shr_str2=getCode(str.substring(2));
				for(int i=0;i<shr_str2.length;i++)
				{
					shr_str2[i]=ch[Integer.parseInt(str.substring(0,2))]+""+shr_str2[i];
				}
			}
			
			String send_str[]=new String[shr_str1.length+shr_str2.length];
			
			int k=0;
			
			for(String a:shr_str1)
				send_str[k++]=a;
			
			for(String a:shr_str2)
				send_str[k++]=a;
			
			return send_str;
		}
		
	}

}
