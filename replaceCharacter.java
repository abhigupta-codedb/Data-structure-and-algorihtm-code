import java.util.*;
public class replaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String str0=sc.next();
		String str1=sc.next();
		String str2=sc.next();
		
		char c1=str1.charAt(0);
		char c2=str2.charAt(0);
		
		System.out.println(replaceCharacter(str0, c1, c2));
		
		sc.close();
	}
	
	public static String replaceCharacter(String input, char c1, char c2) {
		
		char arr[]=replaceCharacter2(input.toCharArray(),0, c1, c2);
		String str="";
		
		for(char a:arr)
			str+=a;
		
		return str;

	}
	
	public static char[] replaceCharacter2(char arr[],int n, char c1, char c2) {
		
		if(n>=arr.length)
			return arr;
		else if(arr[n]==c1)
			arr[n]=c2;
		
		return replaceCharacter2(arr, n+1, c1, c2);

	}

}
