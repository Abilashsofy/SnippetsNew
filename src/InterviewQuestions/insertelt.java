package InterviewQuestions;

public class insertelt {

	public static void main(String[] args) {

		String input[]= {"A","B","D","E","F"};
		String insert[]=new String[input.length+1];
		String remove[]=new String[input.length-1];
		int count=0;

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

		System.out.println("Inserted C in Input array");
		
		for (String insertele : insert) {
			System.out.print(insertele + " ");
			
		}
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Removed D from Input");
		for(int i=0;i<remove.length;i++)
		{
			if(input[i].equalsIgnoreCase("D"))
			{
				remove[i]=input[i+1];
				count++;
			}
			else
			{
				if(count==0)
				remove[i]=input[i];
				else
					remove[i]=input[i+1];
			}
			
		}
		for (String removeelt : remove) {
			System.out.print(removeelt + " ");
		}

	}

}
