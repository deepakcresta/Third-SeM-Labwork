package labWork;

public class secondSmallestNo {
	public static void main(String[] args){
		int arraNum[] = {12, 6, 17, 9};
		for(int i = 0; i<4; i++)
		{
		for(int j = i+1; j<4; j++)
		{
		if(arraNum[i] > arraNum[j])
		{
		int temp = arraNum[i];
		arraNum[i] = arraNum[j];
		arraNum[j] = temp;
		}
		}
		}
		System.out.println(" Second smallest numberof the  array is: " + arraNum[1]);
		}
}
