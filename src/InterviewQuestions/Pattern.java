package InterviewQuestions;

public class Pattern {

	public static void main(String[] args) {
		int i, j, k = 1;
		for (i = 1; i <= 5; i++)//no. of rows 
		{
			for (j = 1; j < i + 1; j++)//printing values
			{
				System.out.print(i + " ");//Manipulate here for desired results. k++ is diff from k+2. 
				//we can give *, k+2, i instead of k++ to print results accordingly
			}

			System.out.println();
		}
System.out.println("---------------------");
		for(int a=1;a<=5;a++)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
