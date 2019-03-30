package InterviewQuestions;

public class DiamondPattern {
	
	 public static void main(String[] args) {
		 
		 //For Triangle
		 
	        int number, i, k, count;
	        number = 5;
	        count = number - 1;
	        for (k = 1; k <= number; k++)//no. of rows
	        {
	            for (i = 1; i <= count; i++)//leaving space
	                System.out.print(" ");
	            count--;
	            for (i = 1; i <= 2 * k - 1; i++)//print values
	                System.out.print("*");
	            System.out.println();
	        }
	        System.out.println("---------------------------");
	        //For Diamond
	        count = 1;
	        for (k = 1; k <= number - 1; k++)//no. of rows
	        {
	            for (i = 1; i <= count; i++)//leaving space
	                System.out.print(" ");
	            count++;
	            for (i = 1; i <= 2 * (number - k) - 1; i++)//printing values
	                System.out.print("*");
	            System.out.println();
	        }
	    }

}
