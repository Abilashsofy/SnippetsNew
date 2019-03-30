package InterviewQuestions;

public class substring {

	public static void main(String[]args)
	{

		String test1="yyyyyAadvikyyyy";
		String Result1 = test1.substring(5,11);
		System.out.println(Result1);
		String test2="ddddAsofyzzzz";
		String Result2 = test2.substring(test2.indexOf('A')+1,test2.indexOf('y')+1);
		System.out.println(Result2);
		String test3="abilashsofyaadvik";
		String Result3 = test3.substring(test3.indexOf("sofy"));
		System.out.println(Result3);
		String test4="abilashsofyaadvik";
		String Result4 = test4.replace("sofy","ajay");
		System.out.println(Result4);
        String test5="abilashsofy";
        String Result5=test5.substring(test5.indexOf("abilash")).concat("aadvik");
        System.out.println(Result5);

	}
}
