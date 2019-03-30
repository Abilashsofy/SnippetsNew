package InterviewQuestions;

import java.util.Scanner;

public class MatrixMul {
	
	public static void main(String args[])
	{
		//condition: No. of col of 1st matrix must be equal to no. of rows of second matrix
		// Row * Col
		//Result will be no. of col of 2nd matrix and no. of rows of first matrix/common factor
		int c,d,m,n,sum=0,k,p,q;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter no. of rows and col for first matrix");
		
		m = in.nextInt();
	      n = in.nextInt();
	 
	      int first[][] = new int[m][n];
	 
	      System.out.println("Enter elements of first matrix");
	 
	      for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	            first[c][d] = in.nextInt();
	 
	      System.out.println("Enter the number of rows and columns of second matrix");
	      p = in.nextInt();
	      q = in.nextInt();
	      
	      if (n != p)
	          System.out.println("The matrices can't be multiplied with each other.");
	       else
	       {
	          int second[][] = new int[p][q];
	          int multiply[][] = new int[m][q];
	  
	          System.out.println("Enter elements of second matrix");
	  
	          for (c = 0; c < p; c++)
	             for (d = 0; d < q; d++)
	                second[c][d] = in.nextInt();
	  
	          for (c = 0; c < m; c++)//row of 1st
	          {
	             for (d = 0; d < q; d++)//col of second
	             {  
	                for (k = 0; k < n; k++)//common factor i.e n=p
	                {
	                   sum = sum + first[c][k]*second[k][d];
	                }
	  
	                multiply[c][d] = sum;
	                sum = 0;
	             }
	          }
	  
	          System.out.println("Product of the matrices:");
	  
	          for (c = 0; c < m; c++)
	          {
	             for (d = 0; d < q; d++)
	                System.out.print(multiply[c][d]+"\t");
	  
	             System.out.print("\n");
	          }
	       }
	    }
		
	}


