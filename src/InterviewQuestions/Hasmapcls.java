package InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hasmapcls {

	public static void main(String args[])
	{

		HashMap<Integer,String>hmap=new HashMap<Integer,String>();
		hmap.put(1,"Abilash");
		hmap.put(2,"Sofy");
		hmap.put(3,"Aadvik");
		
		System.out.println(hmap);
		
		Set hset=hmap.entrySet();
		
		Iterator it = hset.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mentry = (Map.Entry)it.next();
			//Map.Entry is an interface. Access entry in the map 
			//and manipulate them
			System.out.println("The key is" + mentry.getKey());
			System.out.println("The Value is" + mentry.getValue());
			
		}
		
	}




}
