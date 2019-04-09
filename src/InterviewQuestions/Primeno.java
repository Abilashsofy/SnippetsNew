package InterviewQuestions;

public class Primeno {

	public static void main(String args[])
	{
		//prime no. is a whole no. which is greater than 1 and divisible only by 1 and  itself
		int i =0;
		int num =0;
		//Empty String
		String  primeNumbers = "";

		for (i = 2; i <= 100; i++)         
		{ 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}	
		}	
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

}
