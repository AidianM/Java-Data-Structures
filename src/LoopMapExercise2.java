import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 * You are a car dealer. Create a hash map of vehicles. 
 * The model is the Key, the make is the Value. Ask the 
 * customer what car (model) they are looking for. Use 
 * the Hash Map to determine if you have that vehicle, 
 * and what make it is. 
 * (e.g."Oh, you're looking for a Civic? Our Honda 
 * selection is right over here...")
 */

public class LoopMapExercise2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Map<String, String> carDealer = new HashMap<>();

		
		carDealer.put("Civic", "Honda");
		carDealer.put("Accord", "Honda");
		carDealer.put("Odyssey", "Honda");
		carDealer.put("Solara", "Toyota");
		carDealer.put("Camry", "Toyota");
		carDealer.put("Prius", "Toyota");
		
		
		System.out.println("Hi there, welcome to Price Honda-Toyota, where we have...\nseveral types of Hondas and Toyotas.");
		
		System.out.println("Are you looking for a car?");
		String tryAgain = input.nextLine().toLowerCase();

		System.out.println("\nWhat model of car are you looking for?");   
		String carModel = input.nextLine();
		
		boolean hasCar = carDealer.containsKey(carModel);
	
			if (!hasCar) {
				System.out.println("Sorry, doesn't look like we've got that in stock.");
			} else {
				String result = carDealer.get(carModel);
				System.out.println("\nYou want a "+ carModel +"? Sure thing, we've got it. All of our "+ result+"s are right over here.");
			}
	}
			

}
