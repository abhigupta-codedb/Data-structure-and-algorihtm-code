package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class princessFarida {
	
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
		
		int test=fr.nextInt();
		
		while(test>0)
		{
			int n=fr.nextInt();
			
			long arr[]=new long[n];
			
			for(int i=0;i<n;i++)
				arr[i]=fr.nextInt();
			
			System.out.println(max(maxcoinsE(arr),maxcoinsO(arr)));
			
			test--;
		}
	}

	private static long max(long maxcoinsE,long maxcoinsO) {
		// TODO Auto-generated method stub
		return (maxcoinsE>maxcoinsO?maxcoinsE:maxcoinsO);
	}

	private static long maxcoinsO(long[] arr) {
		// TODO Auto-generated method stub
		long sum=0;
		
		for(int i=0;i<arr.length;i=i+2)
		{
			sum+=arr[i];
		}
		return sum;
	}

	private static long maxcoinsE(long[] arr) {
		// TODO Auto-generated method stub
		long sum=0;
		
		for(int i=1;i<arr.length;i=i+2)
		{
			sum+=arr[i];
		}
		return sum;
	}

}
