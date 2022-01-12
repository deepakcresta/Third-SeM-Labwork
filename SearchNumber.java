package labWork;

import java.util.Scanner;
public class SearchNumber{
public static void main(String[] args){
int count=0, n;
Scanner input = new Scanner(System.in);
System.out.print("Enter a number to search: ");
n = input.nextInt();
int arrayNum[] = {13,2, 56, 17, 9, 105, 39, 2, 9};
for(int i = 0; i < arrayNum.length; i++){
if(n == arrayNum[i])
count++;
}
if(count!=0)
System.out.println(n + " is in array and repeated " + count + " times.");
else
System.out.println(n + " is not in array.");
}
}