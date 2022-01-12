package labWork;

public class gratestElement {
	public static void main(String[] args){
		int arrayNum[] = {22, 36, 107, 19};
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
		System.out.println("Largest elements is: " + arrayNum[0]);
		}
}
