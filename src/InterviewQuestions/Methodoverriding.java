package InterviewQuestions;

public class Methodoverriding extends overridin {
	
	void override()
	{
		System.out.println("I am in subclass class");
	}
	
	public static void main(String args[])
	{
		overridin o = new Methodoverriding();
		o.override();
		overridin o2=new overridin();
		o2.override();
	}

}

class overridin 
{
	void override()
	{
		System.out.println("I am in Parentclass");
	}
}