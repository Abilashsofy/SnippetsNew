package InterviewQuestions;

public class infacecls implements fruit {
	
	public void fruitimple()
	{
		System.out.println("Interface is of abstract type with keyword interface. Object can't be created"
				+ "it can have abstract method without abstract keyword with same behavior and have constanct declarations "
				+ "i.e implementation will be done by class");
	}
	
	public static void main(String args[])
	{
		infacecls in = new infacecls();
		in.fruitimple();
		
	}

}

interface fruit
{
	void fruitimple();
}