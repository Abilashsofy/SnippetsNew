package InterviewQuestions;

public class ipregex {

	public static void main(String args[])
	{
		
        isValidElement("183.83.48.255");
	}

	public static boolean isValidElement(String token) {
		String[] validString = token.split("\\."); 
		if (validString.length != 4)
			return false;
		for (String str: validString ) {
			int i = Integer.parseInt(str); 
			if ((i < 0) || (i > 255)) { 
				System.out.println("IP Address is invalid");
				return false; 
			} 
		}
		System.out.println("Valid");
		return true; 

	}

}
