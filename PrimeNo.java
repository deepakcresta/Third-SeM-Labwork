package labWork;


public class PrimeNo {
	public static void main(String[] args){
		int number;
		for(number=1; number<=100; number++)
		{
		int count=0;
		for(int i=2; i<=number/2; i++)
		{
		if(number%i==0)
		{
		count++;
		break;
		}
		}
		if(count == 0 && number != 1)
		System.out.print(number + "\t");
		}
		}
		
}