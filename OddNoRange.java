package labWork;
import java.util.Scanner;

public class OddNoRange {

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int n1 = input.nextInt();
	System.out.print("Enter second number: ");
	int n2 = input.nextInt();
	for(int i=n1;i<=n2;i++)
	{
	if(i%2!=0)
	System.out.print(i + "\t");
	}
	}
	}
	