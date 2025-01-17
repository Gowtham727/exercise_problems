package exercise_problems;
import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter a single-digit number:");
		        int number = scan.nextInt();
		        if (number < 0 || number > 9) {
		            System.out.println("Invalid input! Please enter a single-digit number.");
		        } else {
		            System.out.println("The number in words is: " + toWord(number));
		        }

		        
		    }

		    public static String toWord(int number) {
		        String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		        return words[number];
		    }
		


	}


