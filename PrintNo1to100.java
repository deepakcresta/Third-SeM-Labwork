


package labWork;


public class PrintNo1to100 {
	public static void main(String[] args) 
	{
		int number = 1;
		
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 100)
		{
			System.out.print(num +" "); 
			printNumbers(num + 1);
		}	
	}
}