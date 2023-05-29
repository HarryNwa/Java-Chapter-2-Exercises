import java.util.Scanner;
public class Exercise8{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Choose any number  ");
	int oneNumber = input.nextInt();
	System.out.println("Choose a second number  ");
	int numberTwo = input.nextInt();
	
	int tripleNumber = oneNumber * 3;
	int doubleNumber = numberTwo * 2;
	//boolean isMultiple = (tripleNumber % doubleNumber) == 0;
	//System.out.println("Is the first number the multiple of the second number doubled?" + isMultiple);
	
	if ((tripleNumber % doubleNumber) < 2){
	System.out.printf("Number one tripled to %d is a multiple of the second number doubled at %d%n", tripleNumber, doubleNumber );
	}
	
	if ((tripleNumber % doubleNumber) > 2){
	System.out.printf("Number one tripled to %d is not a multiple of the second number doubled at %d%n", tripleNumber, doubleNumber );
	}
	
	
	
	}


}
