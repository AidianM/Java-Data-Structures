import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoopMapExercise1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
//		System.out.println("Please enter Number One:");
//		String number1 = input.netLine();
//		
//		System.out.println("Please enter Number Two:");
//		String number2 = input.nextLine();
//		
//		System.out.println("Please enter Number Three:")
//		String number3 = input.nextLine();	T
//		
//		System.out.println("Please enter Number Four:");
//		String number4 = input.nextLine();
//		
//		System.out.println("Please enter Number Five:");
//		String number5 = input.nextLine();		
//		
//		
//		String fiveNumbers = number1+number2+number3+number4+number5;
		
		System.out.println("Enter 5 numbers, separated with enters.");
		List<Integer> numbers = new ArrayList<>();
		
		for (int i=0; i<5;i++) {
			numbers.add(Integer.parseInt(input.nextLine()));
		}
		System.out.println(numbers);
		
		//Find sum/product/largest/smallest of these 5
//		int sum = 0;
//		int product = 1; //products initialize to 1 because x*0=0
//		int largest = numbers.get(0);
//		int smallest = numbers.get(0);

		
		
//		for (Integer number : numbers) {
//			sum += number;
//			product *= number;
//		}
		
		//sum/product complete
		
		
		//several ways to find max/min
//		int largest = Collections.max(numbers);
//		int smallest = Collections.min(numbers);
		//loop scanning is intensive
		
		//Secondary:
		int first = numbers.get(0);

		int sum = first;
		int product = first;
		int largest = first;
		int smallest = first;
		
		for (int i = 1; i<numbers.size(); ++i) {
			int current = numbers.get(i);
			sum += current;
			product *= current;
			if (current > largest) {
				largest = current;
			}
			if (current<smallest) {
				smallest = current;
			}
		}
		//initializes at first number (0) and goes 
		//from there.
		
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+product);
		
		System.out.println("Largest Number: "+largest);
		System.out.println("Smallest Number: "+smallest);
		
		
	
		
		
		
		
		
		
		
		
		
		/*String myString = "I really love ice cream!";
		
		String words[] = myString.split(" "); //splits on space
		//via Split: words will contain ("I", "really", "love", etc)
		
		List<String> wordList;
		
		wordList = Arrays.asList(words);
		System.out.println(wordList);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
