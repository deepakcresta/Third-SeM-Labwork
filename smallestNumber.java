package labWork;

public class smallestNumber {
	public static void main(String[] args){
		int arrayNum[] = {102, 6, 105, 93,1022};
		for(int i = 0; i<4; i++)
		{
		for(int j = i+1; j<4; j++)
		{
		if(arrayNum[i] > arrayNum[j])
		{
		int temp = arrayNum[i];
		arrayNum[i] = arrayNum[j];
		arrayNum[j] = temp;
		}
		}
		}
		System.out.println("The smallest no  is: " + arrayNum[0]);
		}

}
