public class Exercise6{
	public static void main(String[] args){
	
	int first = 12;
	int second = 8;
	int third = 11;
	int fourth = 13;
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
	if(third > first){
	largest = third;
	}
	if(fourth > first){
	largest = fourth;
	}
	if(fifth > first){
	largest = fifth;
	}
	
	System.out.printf("%d %d %d %d %d%n", first, second, third, fourth, fifth);
	System.out.printf("The smallest number is %d%n", + smallest);
	System.out.printf("The largest number is %d%n", + largest);
	
	
	
	
	
	
	
	}

}
