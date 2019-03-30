	package InterviewQuestions;
	
	import java.util.HashMap;
	import java.util.Set;
	
	public class Occurofchar {
	
		public static void main(String[]args)
		{
	
			duplicate("aafhjgabb");
		}
	
		static void duplicate(String str)
		{
			HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
			char[] getchar=str.toCharArray();
			for(char c:getchar)
			{
				if(hm.containsKey(c))
				{
					hm.put(c,hm.get(c)+1);
				}
				else
				{
					hm.put(c,1);
				}
			}
			System.out.println(hm);
	
		}
	
	}
