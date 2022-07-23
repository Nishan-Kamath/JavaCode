import java.util.Scanner;

public class CBTD {
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a binary Number  : ");
		String binarynumber = scan.nextLine();
		int decimal = Integer.parseInt(binarynumber, 2);
		System.out.println("Decimal value of " + binarynumber + " is : " + decimal);
	}

}
