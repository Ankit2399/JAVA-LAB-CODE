import java.util.*;
class Addition
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number::\n
		");
		int a = sc.nextInt();
		System.out.println("Enter the second number::");
		int b = sc.nextInt();
		// Your code won't compile with a valid add statement
		int result = a+b;
		System.out.println("The sum is:" + result);
	}
}
