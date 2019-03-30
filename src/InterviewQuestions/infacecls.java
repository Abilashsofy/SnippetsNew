package InterviewQuestions;

public class infacecls implements fruit {
	
	public void fruitimple()
	{
		System.out.println("The Fruit is mango");
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