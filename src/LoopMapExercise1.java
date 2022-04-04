import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoopMapExercise1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers, separated with enters.");
		List<Integer> numbers = new ArrayList<>();
		
		for (int i=0; i<5;i++) {
			numbers.add(Integer.parseInt(input.nextLine()));
		}
		System.out.println(numbers);
		
		
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
