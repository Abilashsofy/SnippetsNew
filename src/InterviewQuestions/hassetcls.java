package InterviewQuestions;

import java.util.HashSet;
import java.util.Iterator;

public class hassetcls {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Abilash");
		hset.add("Sofy");
		hset.add("Aadvik");
		hset.add("Aadvik");
		
		Iterator it = hset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
