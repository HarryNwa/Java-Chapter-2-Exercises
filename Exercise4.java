import java.util.Scanner;

public class Exercise4{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Choose a number ");
		int firstChoice = input.nextInt();
	System.out.println("Choose another number ");
		int secondChoice = input.nextInt();
	System.out.println("Choose a third number ");
		int thirdChoice = input.nextInt();
	
	int sum = firstChoice + secondChoice + thirdChoice;
	int average = sum / 3;
	int product = firstChoice * secondChoice * thirdChoice;
	
	int smallest = firstChoice;
	
	if (secondChoice < firstChoice){
	smallest = secondChoice;
	}
	
	if (thirdChoice < secondChoice){
	smallest = thirdChoice;
	}
	
	int largest = firstChoice;
	
	if (secondChoice > firstChoice){
	largest = secondChoice;
	}
	
	if (thirdChoice > secondChoice){
	largest = thirdChoice;
	}
	
	
	System.out.printf("%d %d %d%n", sum, average, product);
	System.out.printf("The smallest number is %d%n", + smallest);
	System.out.printf("The largest number is %d%n", + largest);
	
	
	
	}

}
