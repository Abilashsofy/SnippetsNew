package InterviewQuestions;

class Parent {
    public Parent()
    {
    	System.out.println("I am constructor");
    }
 
    public void print()
    {
    	System.out.println("I am in Parent print");
    }
}

public class Childcls extends Parent {

    public void print()
    {
    	System.out.println("I am in child print");
    }
 
    public static void main(String[] args)
    {
        Childcls c1 = new Childcls(); // allowed
        c1.print();
       
        //Childcls c2 = new Parent(); // not allowed
    }
}