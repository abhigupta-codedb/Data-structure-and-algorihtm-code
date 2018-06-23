package BacktrackMergeBinarySearch;
import java.util.*;
public class RatInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int maze[][]=new int [n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				maze[i][j]=sc.nextInt();
		}
		ratInMaze(maze,n);
		
		sc.close();
	}
	
	public static void ratInMaze(int maze[][],int n)
	{
		int sol[][]=new int[n][n];
		
		
		mazeHelper(maze,n,sol,0,0);
	}

	private static void mazeHelper(int[][] maze, int n, int[][] sol, int x, int y) {
		// TODO Auto-generated method stub
		if(x==n-1 && y==n-1)
		{
			sol[x][y]=1;
			printSol(sol,n);
			sol[x][y]=0;
			return;
		}
		
		if(x>=n||y>=n||x<0||y<0||sol[x][y]==1||maze[x][y]==0)
		{
			return;
		}
		
		sol[x][y]=1;
		mazeHelper(maze, n, sol, x-1, y);//up
		mazeHelper(maze, n, sol, x+1, y);//down
		mazeHelper(maze, n, sol, x, y-1);//left
		mazeHelper(maze, n, sol, x, y+1);//right
		sol[x][y]=0;
	}

	private static void printSol(int[][] sol, int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(sol[i][j]+" ");
		}
		System.out.println();
		return;
	}

}
