import java.util.Scanner;
class multiply{
	public static void main(String[] args){
	int a,b;
	int mul;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the 1st number here : ");
	a = in.nextInt();
	System.out.println("Enter the 2nd number here : ");
	b = in.nextInt();
	mul = a*b;
	System.out.println("The result is : "+mul);

	}
}
