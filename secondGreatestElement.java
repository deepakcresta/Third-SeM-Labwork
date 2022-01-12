package labWork;

public class secondGreatestElement {
	public static void main(String[] args){
		int arrayNum[] = {102, 16,25, 7, 90};
		for(int i = 0; i<4; i++)
		{
		for(int j = i+1; j<4; j++)
		{
		if(arrayNum[i] < arrayNum[j])
		{
		int temp = arrayNum[i];
		arrayNum[i] = arrayNum[j];
		arrayNum[j] = temp;
		}
		}
		}
		System.out.println("Second greatest number is: " + arrayNum[1]);
		}

}
