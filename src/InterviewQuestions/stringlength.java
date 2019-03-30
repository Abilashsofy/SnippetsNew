package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class stringlength {

	public static void main(String[]args)
	{

		String input="aadvikdheera";
		int counter=0;

		char[]name=input.toCharArray();
		ArrayList<Character>len=new ArrayList<Character>();

		for(char c:name)
			len.add(c);

		ListIterator li = len.listIterator();

		while(li.hasNext())
		{
            li.next();
			counter=counter+1;

		}
		System.out.println("The length of the String is: "+counter);
	}

}


