package InterviewQuestions;

public class conscls {
	
	public conscls()
	{
		System.out.println("Constructor with out parameter");
	}
	
	conscls(int a)
	{
		System.out.println("Constructur with parameter "+ a + "is passed from main");
	}
	
	conscls(String name)
	{
		System.out.println("Construtor is overloaded "+ name + "is passed from main");
	}
	
	
	

	public static void main(String args[])
	{
		conscls co1 = new conscls();
		conscls co2 = new conscls(3);
		conscls co3 = new conscls("Aadvik");
		
		
	}
	
}
