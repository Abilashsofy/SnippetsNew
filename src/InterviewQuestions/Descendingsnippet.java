package InterviewQuestions;

public class Descendingsnippet {

	public static int temp;

	public static void main(String args[])
	{
		int a[]={99,66,10,115,33,22,55};


		for (int i = 0; i < a.length; i++)   
		{  
			for (int j = i + 1; j < a.length; j++)   
			{  
				if (a[i] < a[j])   //< - less than ->Descending and finds smallest and vice versa
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}
		System.out.println(a.length);
		System.out.println("The largest/smallest no. is:" + temp);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Ascending/Descending order is: "+ a[i] + " ");
		}

	}
}
