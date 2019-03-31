package InterviewQuestions;

public class splitchars {

	public static void main(String[]args)
	{

		String input ="AaDvi2kD4h5e6era";
		
		String lower = "",upper = "",number="";
		
		for(int i=1;i<input.length();i++)
		{
			char c = input.charAt(i);
			if(Character.isUpperCase(c))
			{
				upper=upper+c;
			}
			if(Character.isLowerCase(c))
			{
				lower+=c;
			}
			if(Character.isDigit(c))
			{
				number+=c;
			}
			
		}
		
		System.out.println("The Uppercase characters are: "+upper);
		System.out.println("The Lowercase characters are: "+lower);
		System.out.println("The numerical characters are: "+number);		
	}


}
