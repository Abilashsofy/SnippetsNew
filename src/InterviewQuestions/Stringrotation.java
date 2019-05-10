package InterviewQuestions;

public class Stringrotation {
	
	
	
	public static void main(String args[])
	{
		
		int array1[]= {1,2,3,4,5};
		int newarray[]=shiftarray(array1);
		printarray(newarray);
	}
	
	public static int[] shiftarray(int[] array1)
	
	{
		System.out.println("Length: "+array1.length);
		int[] array2=new int[array1.length];
		for(int i=0;i<array1.length-2;i++)
		{
			array2[i+1]=array1[i];// by one step rotate
			array2[i+2]=array1[i];//by 2 step
			System.out.println("Instant print: "+array2[i+2] + " "+i);
		}
		
		array2[0]=array1[array1.length-1];
		System.out.println(array2[0]);
		array2[1]=array1[array1.length-2];		
		System.out.println(array2[1]);		
//		array2[0]=array1[array1.length-1];
		return array2;
		
	}
	
	public static void printarray(int[] newarray)
	{
		System.out.println("---------");
		for(int x:newarray)
		{
			
			System.out.println(x + " ");
		}		
	}
	
	
}
