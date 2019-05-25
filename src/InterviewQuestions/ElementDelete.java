package InterviewQuestions;

import java.util.ArrayList;

public class ElementDelete {

	public static void main(String[] args) {

		int a[]= {1,2,9,3,4,9,5};
		int k=-1;
		int l=-1;

		for (int i=0;i<=a.length-1;i++) {

			if(a[i]==9)
			{
				count++;
			}
		}
		int b[]=new int[a.length+1];
		for(int j=0;j<=b.length-1;j++)
		{
			if(j==2)
			{
				System.out.println(j);
				//l++;
				k++;
				b[k]=2;
			}
			else
			{
				k++;
				l++;
				b[k]=a[l];
			}
		}
		for (int p : b) {
			
			System.out.print(p);
		}
		
	}
}


