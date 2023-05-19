import java.util.*;
public class midterm{

	//first algorithm
	public static void algo1(){
		//create scanner
		Scanner s = new Scanner(System.in);

		//prompt user and take input
		System.out.println("How many numbers would you like to enter?");
		int numOfNums = Integer.parseInt(s.nextLine());
		
		//set values
		int count = numOfNums;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		//for loop that asks for as many numbers as the user said they wanted to enter, and determines the max and min of those numbers
		for (int i = count; i > 0; i--){
			System.out.println("Please enter a number: ");
			int num = s.nextInt();

			if (num > max){
				max = num;
			}

			else if (num < min){
				min = num;
			}
		}
		
		//print the output
		System.out.println("The maximum number in the sequence is: " + max);
		System.out.println("The minimum number in the sequence is: " + min);
	}

	//second algorithm
	public static void algo2(){
		//create scanner
		Scanner s = new Scanner(System.in);
		
		//set values
		double count = 0;
		double sum = 0;
		boolean value = true;

		//for loop that takes in values until the user enters "q" to quit
		for (boolean v = value; v; v = value){
			System.out.println("Please enter a number or enter q to quit:");

			String entered = s.nextLine();

			if (entered.equals("q")){
				break;
			}
			
			//code I don't need
			/*
			else if (entered.contains("a") || entered.contains("b") || entered.contains("c") || entered.contains("d") || entered.contains("e") || entered.contains("f") || entered.contains("g") || entered.contains("h") || entered.contains("i") || entered.contains("j") || entered.contains("k") || entered.contains("l") || entered.contains("m") || entered.contains("n") || entered.contains("o") || entered.contains("p") || entered.contains("r") || entered.contains("s") || entered.contains("t") || entered.contains("u") || entered.contains("v") || entered.contains("w") || entered.contains("x") || entered.contains("y") || entered.contains("z")){
				System.out.println("Please enter a valid input");
			}
			*/

			else{
				double number = Double.parseDouble(entered);
				sum += number;
				count++;
			}
		}

		//calculate sum and average and print
		System.out.println("The sum is: " + sum);
		double avg = sum / count;
		System.out.println("The average is: " + avg);
	}
	
	//third algorithm
	public static void algo3(){
		//create scanner
		Scanner in = new Scanner(System.in);

		//prompt user for thier string
		System.out.println("Please enter a string: ");
		String input = in.nextLine();
		
		//prompt user for string to look for
		System.out.println("Please enter the characters you would like to find.");
		String find = in.nextLine();
		
		//set values
		int x = 0;
		boolean patternFound = false;
		
		//code I want to keep for reference but doesnt actaully do anything
		/*
		while (x < input.length()) {
			if (input.charAt(x) == 's' && input.charAt(x+1) == 't') {
				patternFound = true;
				break;
			}
		x++;
		}
		*/

		/*
		if (input.indexOf(find) != -1){
			patternFound = true;	
		} else{
			patternFound = false;
		}
		*/

		int initialLength = input.length();
		int difference;
		int foundAt;

		int searchStringLength = find.length();
        int index = input.indexOf(find);
        
        while (index >= 0) {
            System.out.println("Found at index: " + index);
            index = input.indexOf(find, index + searchStringLength);
		}
		
		//for loop that searches for the string the user wants to search for and counts how many times the string is present
		for (int i = input.indexOf(find); i != -1; i = input.indexOf(find)){
			if (patternFound){
				x++;
				input = input.substring(i + 1);
			}
			else{
				patternFound = true;
				x++;
				input = input.substring(i + 1);
			}

		}

		// if pattern was found print that it was found and how many times it was found
		if (patternFound) {
			System.out.println("The pattern was found " + x + " times.");
		}

		//if pattern was not found, say so
		else {
			System.out.println("The pattern was not found.");
		}
	}
	
	//method I made to clear sreen and make the output of this program look nice
	public static void cls(){
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	//main method
	public static void main(String[] args){
		//while loop that makes this repeat until user enters q
		while (true){
			Scanner s = new Scanner(System.in);
			
			//present algorithm options to the user
			System.out.println("You have the coice between three algorithms:");
			System.out.println("Choice A: An algorithm that determines the maximum and minimum value in a set of user-provided integers.");
			System.out.println("Choice B: An algorithm that determines the sum and the average in a set of user-provided numbers.");
			System.out.println("Choice C: An algorithm that finds a specific pattern of letters (i.e “st”) chosen by the user, in a user-provided String. User will need to provide both the phrase and the pattern they would like to check for.");
			System.out.println("If you wish to quit enter Q");

			//println for seperation
			System.out.println();
			
			//prompt user for input
			System.out.println("Please enter A, B, or C to choose, or Q to quit:");
			String choice = s.nextLine();
			
			//run program that user entered or quit
			if (choice.toLowerCase().equals("a")){
				cls();
				algo1();
			}

			else if (choice.toLowerCase().equals("b")){
				cls();
				algo2();
			}
			
			else if (choice.toLowerCase().equals("c")){
				cls();
				algo3();
			}
			
			else if(choice.toLowerCase().equals("q")){
				break;
			}

			else{
				System.out.println("You did not enter a valid option");
			}
			
			//println just to seperate each iteration of this loop
			System.out.println();
		}
	}
}
