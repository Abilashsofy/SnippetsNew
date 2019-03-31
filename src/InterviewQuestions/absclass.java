package InterviewQuestions;

public class absclass extends absdefcls {
	
	void implement()
	{
		System.out.println("An abstract class can have an abstract method without body "
				+ "and it can have methods with implementation also. "
				+ "abstract keyword is used to create a abstract class and method. "
				+ "Abstract class in java can't be instantiated.");
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
