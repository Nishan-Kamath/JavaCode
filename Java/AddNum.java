import java.util.Scanner;

public class AddNum{
	public static void main(String [] args){

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the First number   : ");
		float num1 = scan.nextFloat();

		System.out.print("Enter the Second number  : ");
		float num2 = scan.nextFloat();

		float sum=num1+num2;
		
		System.out.print("Sum of "+num1+" and "+num2+" is  : "+sum);
	}
}