package InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class Arylist {
	
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Abilash");
		al.add("Sofy");
		al.add("Aadvik");
		al.add("Aadvik");
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
