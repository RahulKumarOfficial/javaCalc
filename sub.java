import java.util.Scanner;
class subtract{
	public static void main(String[] args){
	int a,b;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter first number here: ");
	a = in.nextInt();
	System.out.println("Enter second number here: ");
	b = in.nextInt();
	int sub;
	sub = a-b;
	System.out.println("Subtraction of 2 numbers is : "+sub);
	}
}
