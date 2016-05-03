import java.util.Scanner;

public class TestCatchNumber{
	//Main Method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//input v1
		System.out.println("Enter your number1:");
		Double v1 = input.nextDouble();
		
		//input v2
		System.out.println("Enter your number2:");
		Double v2 = input.nextDouble();
		
		//create catch object
		CatchNumber catch1 = new CatchNumber();
		System.out.println("Total:" + catch1.add(v1,v2));
	}
}
