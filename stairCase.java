package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stairCase {
	
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
		
		int n=fr.nextInt();
		
		System.out.println(ways(n));
	}

	private static int  ways(int n) {
		// TODO Auto-generated method stub
		
		int out[]=new int[n+1];
		
		out[0]=1;
		out[1]=1;
		out[2]=2;
		
		for(int i=3;i<=n;i++)
		{
			out[i]=out[i-1]+out[i-2]+out[i-3];
		}
		
		
		return out[n];
	}

}
