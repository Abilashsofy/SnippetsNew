package InterviewQuestions;

public class largestno {
	
	public static int temp;

	public static void main(String args[])
	{
		int a[]={44,66,99,115,33,22,55};

		  
		for (int i = 0; i < a.length; i++)   
		{  
			for (int j = i + 1; j < a.length; j++)   
			{  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}
		System.out.println("The largest no. is:" + temp);


	}
}
