import java.util.Scanner;
class add {
	public static void main(String[] args){
	int a ;
	int b ;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter first number here: ");
	a = in.nextInt();
	System.out.println("Enter second number here: ");
	b = in.nextInt();
	int sum = 0;
	sum = a+b;
	System.out.println("Sum of both the digits is : "+sum);
	} 
}
