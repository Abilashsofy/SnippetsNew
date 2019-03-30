package InterviewQuestions;

public class absclass extends absdefcls {
	
	void implement()
	{
		System.out.println("Abstract class is implemented by absclass");
	}
	
	public static void main(String args[])
	{
		absdefcls ab = new absclass();
		ab.implement();
	}
}

abstract class absdefcls
{
	abstract void implement();
	
}
