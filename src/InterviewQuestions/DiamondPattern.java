package InterviewQuestions;

public class DiamondPattern {
	
	 public static void main(String[] args) {
		 
		 
	        int number, i, k, j,count;
	        number = 5;
	        count = number - 1;
	        for (k = 1; k <= number; k++)//no. of rows
	        {
	            for (i = 1; i <=number-k; i++)//leaving space
	                System.out.print(" ");
	            for (j = 1; j <= 2 * k - 1; j++)//print values
	                System.out.print("*");
	            System.out.println();
	        }
	        System.out.println("---------------------------");
	        
	        count = 1;
	        for (k = 1; k <= number - 1; k++)//no. of rows
	        {
	            for (i = 1; i <= count; i++)//leaving space
	                System.out.print(" ");
	            count++;
	            for (j = 1; j <= 2 * (number - k) - 1; j++)//printing values
	                System.out.print("*");
	            System.out.println();
	        }
	    }

}
