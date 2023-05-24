import java.util.Scanner;
public class Exercise8{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Choose any number  ");
		int oneNumber = input.nextInt();
	System.out.println("Choose a second number  ");
	int numberTwo = input.nextInt();
	
	int trippleNumber = oneNumber * oneNumber * oneNumber;
	int doubleNumber = numberTwo * numberTwo;
	
	if ((trippleNumber / doubleNumber) > 2){
	System.out.printf("Number one trippled to %d is a multiple of the second number doubled at %d%n", trippleNumber, doubleNumber );
	}
	
	if ((trippleNumber / doubleNumber) < 2){
	System.out.printf("Number one trippled to %d is not a multiple of the second number doubled at %d%n", trippleNumber, doubleNumber );
	}
	
	
	
	}


}
