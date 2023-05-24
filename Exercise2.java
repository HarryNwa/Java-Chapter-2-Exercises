import java.util.Scanner;

public class Exercise2{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
 
 	System.out.println("Enter your first lucky number  ");
 		int luckyNumber = input.nextInt();
 	System.out.println("Enter your second lucky number  ");
 		int secondLuckyNumber = input.nextInt();
 		
 	   int firstSquare = luckyNumber * luckyNumber;
 	   int secondSquare = secondLuckyNumber * secondLuckyNumber;
 	   int firstSum = firstSquare;
 	   int secondSum = secondSquare;
 	   int difference = firstSum - secondSum;
 	   
 	   System.out.printf("The square of each of the integers is %d and %d respectively.%nThe sum of their squares is %d and %d respectively.%nThe difference of the squares is %d%n", firstSquare, secondSquare, firstSum, secondSum, difference);
 	   

	}

}
