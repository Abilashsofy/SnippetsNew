package InterviewQuestions;

public class insertelt {

	public static void main(String[] args) {

		String input[]= {"A","B","D","E","F"};
		String insert[]=new String[input.length+1];

		//Inserting element at 3rd place

		for(int i=0;i<insert.length;i++)
		{
			if(i>=2)
			{
				if(i==2)
				{
					insert[i]="C";
				}
				else
				{
					insert[i]=input[i-1];
				}
			}
			else
				insert[i]=input[i];
		}

		for (String insertele : insert) {
			System.out.println(insertele + " ");
		}

	}

}
