import java.util.Scanner;

public class TestCatchNumber{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your number1:");
			Double v1 = input.nextDouble();
			
			System.out.println("Enter your number2:");
			Double v2 = input.nextDouble();
			
			CatchNumber catch1 = new CatchNumber();
			System.out.println("Total:" + catch1.add(v1,v2));
		}
}
