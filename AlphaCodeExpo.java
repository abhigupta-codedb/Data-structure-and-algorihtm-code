package DP;
//Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class AlphaCodeExpo {
	
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader fr=new FastReader();
		int size=fr.nextInt();
		//System.out.println(size+" size");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
			arr[i]=fr.nextInt();
		
		System.out.println(count_pairs(arr,size));
	}

	private static int count_pairs(int[] arr, int size) {
		// TODO Auto-generated method stub
		if(size==0 || size==1)
			return 1;
		
		int out=count_pairs(arr, size-1);
		
		if(arr[size-2]*10+arr[size-1]<=26)
		{                                              
			out+=count_pairs(arr, size-2);
		}
		
		return out;  
	}

}
