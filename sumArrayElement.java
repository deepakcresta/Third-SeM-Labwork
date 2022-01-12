package labWork;

public class sumArrayElement {
	public static void main(String[] args){
		int sum = 0;
		int[] arrayNum= {2,3,5,8};
		for(int num: arrayNum)
		{
		sum += num;
		}
		System.out.println("Sum of array elements is: " + sum);
		}
}
