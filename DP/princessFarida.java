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
		int k=1;
		while(k<=test)
		{
			int n=fr.nextInt();
			
			long arr[]=new long[n];
			
			for(int i=0;i<n;i++)
				arr[i]=fr.nextInt();
			
			//System.out.println("Case "+k+":"+max(maxcoinsE(arr),maxcoinsO(arr)));
			System.out.println("Case "+k+":"+maxVal(arr,n));
			
			k++;
		}
	}
	
	private static long maxVal(long arr[],int n)
	{
		long incl=arr[0];
		long excl=0;
		for(int i=1;i<n;i++)
		{
			long pst_excl=excl;
			long pst_incl=incl;
			
			incl=max((arr[i]+pst_excl),pst_incl);
			excl=pst_incl;
		}
		
		
		return max(incl,excl);
	}
	
	private static long max(long x,long y)
	{
		return x>y?x:y;
	}
}

