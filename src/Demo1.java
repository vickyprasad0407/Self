import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the order of a matrix");
       int row=sc.nextInt();
       int col=sc.nextInt();
       int mat[][]=new int[row][col];
       System.out.println("enter the "+row*col+"element row wise");
       for(int i=0;i<mat.length;i++)
       {
    	   for(int j=0;j<mat.length;j++)
    	   {
    		   mat[i][j]=sc.nextInt();
    	   }
       }
       System.out.println("user entered the matrix element ");
       rowWiseReverse(mat);
       for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
               System.out.print(mat[i][j]+" ");
			}
		}

       
       
	}
	public static int [][] transpose(int [][] mat)
	{
		int [][] tra=new int [mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				tra [i][j]=mat[j][i];
			}
		}
		return tra;
	}
	public static int [] getRowWiseBiggest(int [][] mat)
	{
		int [] big=new int[mat.length];
		for(int i=0;i<mat.length;i++)
		{
			int bg=mat[i][0];
			for(int j=0;j<mat[i].length;j++)
			{
				if(bg<mat[i][j])
					bg=mat[i][j];
			}
			big [i]=bg;
		}
		return big;
	}
	public static void rowWiseReverse(int [][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<(mat[i].length)/2;j++)
			{  
				int temp=mat[i][j];
				mat[i][j]=mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j]=temp;
			}
		}
	}
}


