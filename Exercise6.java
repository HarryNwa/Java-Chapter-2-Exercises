public class Exercise6{
	public static void main(String[] args){
	
	int first = 5;
	int second = 10;
	int third = 15;
	int fourth = 20;
	int fifth = 25;
	
	int smallest = first;
	
	if(second < first){
	smallest = second;
	}
	if(third < second){
	smallest = third;
	}
	if(fourth < third){
	smallest = fourth;
	}
	if(fifth < fourth){
	smallest = fifth;
	}
	
	int largest = first;
	
	if(second > first){
	largest = second;
	}
	if(second > first){
	largest = second;
	}
	if(second > first){
	largest = second;
	}
	if(second > first){
	largest = second;
	}
	
	System.out.printf("%d %d %d %d %d%n", first, second, third, fourth, fifth);
	System.out.printf("The smallest number is %d%n", + smallest);
	System.out.printf("The largest number is %d%n", + largest);
	
	
	
	
	
	
	
	}

}
