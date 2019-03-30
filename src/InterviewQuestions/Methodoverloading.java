package InterviewQuestions;

public class Methodoverloading {
	
	void overload(int a)
	{
		System.out.println("Overloading a Method with one Parameter with name oveload " +a+" is passed");
		 
	}
	void overload(int a, String name)
	{
		System.out.println("Overloading a Method with two parameter with name overload "+a+ name +" is passed");
	}
	
	
	public static void main(String args[])
	{
		Methodoverloading mo = new Methodoverloading();
		mo.overload(10);
		mo.overload(20, "Abilash");
	}

}
