package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class stringreverse {

	public static void main(String[] args)
	{
		String input = "AadvikDheera";

		        // convert String to character array
		        // by using toCharArray
		        char[] try1 = input.toCharArray();
		 
		        for (int i = try1.length-1; i>=0; i--)
		            System.out.print(try1[i]);

//		char[]name=input.toCharArray();
//		ArrayList<Character>reverse=new ArrayList<Character>();
//
//		for(char c:name)
//			reverse.add(c);
//
//		Collections.reverse(reverse);
//		ListIterator li = reverse.listIterator();
//
//		while(li.hasNext())
//		{
//			System.out.print(li.next());
//		}

	}


}

