import java.io.IOException;
import java.util.Scanner;

public class Calc {

public static Scanner scanner = new Scanner(System.in);	
	
	public static void main(String[] args)
	{
		boolean cont = true;
		System.out.println("Please make a selection \n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division");
		int userinput = scanner.nextInt();	
		int amount = 0;
		switch(userinput)
		{
		
			default: 						
				System.out.println("Please enter a valid input");
				break;
			case 1:	
				System.out.println("How many numbers would you like to add?");
				amount = scanner.nextInt();
				addition(amount);
				break;
			case 2:	
				System.out.println("How many numbers would you like to subtract?");
				amount = scanner.nextInt();
				subtraction(amount);
				break;
			case 3:	
				System.out.println("How many numbers would you like to multiply?");
				amount = scanner.nextInt();
				multiplication(amount);
				break;
			case 4:	
				System.out.println("How many numbers would you like to divide?");
				amount = scanner.nextInt();
				division(amount);
				break;
		}
	
	}
	
	public static void addition(int num) {
		num = num--;
		int[] numbers = new int[num];
		int temp = 1;
		for(int i = 0; i < num; i++) {
			System.out.println("Please input number: " + temp);
			numbers[i] = scanner.nextInt();
			temp++;
		}
		
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			
			sum  = numbers[i] + sum;
		}
		System.out.print("Sum = " + sum);
	}
	
	public static void subtraction(int num) {
		num = num--;
		int[] numbers = new int[num];
		int temp = 1;
		for(int i = 0; i < num; i++) {
			System.out.println("Please input number: " + temp);
			numbers[i] = scanner.nextInt();
			temp++;
		}
		
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			
			sum  = numbers[i] - sum;
		}
		System.out.print("Sum = " + sum);
	}
	
	public static void multiplication(int num) {
		num = num--;
		int[] numbers = new int[num];
		int temp = 1;
		for(int i = 0; i < num; i++) {
			System.out.println("Please input number: " + temp);
			numbers[i] = scanner.nextInt();
			temp++;
		}
		
		int sum = numbers[0];
		
		for(int i = 1; i < num; i++) {
			sum  = numbers[i] * sum;
		}
		System.out.print("Sum = " + sum);
	}
	
	public static void division(int num) {
		num = num--;
		int[] numbers = new int[num];
		int temp = 1;
		for(int i = 0; i < num; i++) {
			System.out.println("Please input number: " + temp);
			numbers[i] = scanner.nextInt();
			temp++;
		}
		
		int sum = numbers[0];
		
		for(int i = 1; i < num; i++) {
			sum  = sum / numbers[i];
		}
		System.out.print("Sum = " + sum);
	}
}
