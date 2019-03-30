package InterviewQuestions;

import java.util.Scanner;

public class Matrix {

	public static void main(String args[])
	{
		//condition: both matrix should have equal no. of rows and cols
		
		int m,n,c,d;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter No. of rows and columns");
		m=in.nextInt();
		n=in.nextInt();

		int first[][]=new int[m][n];
		int sec[][]=new int[m][n];
		int sum[][]=new int[m][n];

		System.out.println("Enter the elements for first matrix");

		for (c = 0; c < m; c++)
		{
			for (d = 0; d < n; d++)
			{
				first[c][d] = in.nextInt();
			}
		}	

		System.out.println("Enter the elements for second matrix");

		for (c = 0; c < m; c++)
			for (d = 0; d < n; d++)
				sec[c][d] = in.nextInt();

		for (c = 0; c < m; c++)
	         for (d = 0; d < n; d++)
	             sum[c][d] = first[c][d] + sec[c][d];

		System.out.println("Sun of matrices");

		for(c=0;c<=m;c++)
		{
			for(d=0;d<n;d++)
			{
				System.out.println(sum[c][d]+"\t");
			}
		}

	}

}
