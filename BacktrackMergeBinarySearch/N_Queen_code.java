package BacktrackMergeBinarySearch;
import java.util.*;
public class N_Queen_code {

	public static int board[][];
	public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		PlaceQueens(n);
		System.out.println("count "+count);
		sc.close();

	}

	private static void PlaceQueens(int n) {
		// TODO Auto-generated method stub
		board=new int[11][11];
		
		nQueenHelper(n,0);
	}

	private static void nQueenHelper(int n, int row) {
		// TODO Auto-generated method stub
		if(row==n)
		{
			//we have reached some Solution.
			//print the matrix and return.
			System.out.println("-------------------");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
					System.out.print(board[i][j]+" ");
				
				System.out.println();
			}
			count++;
			return;
		}
		
		// we have to place at all possible solns
		
		for(int j=0;j<n;j++)
		{
			if(isPossible(n,row,j))
			{
			 board[row][j]=1;
			 nQueenHelper(n, row+1);
			 board[row][j]=0;//so that we can go for other solution.
			}
		}
		
		return;
		
	}

	private static boolean isPossible(int n, int row, int col) {
		// TODO Auto-generated method stub
		
		// same column
		for(int i=row-1;i>=0;i--)
		{
			if(board[i][col]==1)
				return false;
		}
		
		// upper left column
		for(int i=row-1, j=col-1 ; i>=0&&j>=0; i--,j--)
		{
			if(board[i][j]==1)
				return false;
		}	
		
		// upper right column
		for(int i=row-1, j=col+1 ; i>=0&&j<n; i--,j++)
		{
			if(board[i][j]==1)
				return false;
		}
		
		return true;
	}

}
