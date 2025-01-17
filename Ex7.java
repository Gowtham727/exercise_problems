package exercise_problems;
import java.util.Scanner;
import java.lang.Math;
public class Ex7 {

	public static void main(String[] args) {   
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a number to check if it is a perfect square:");
		        int number = scanner.nextInt();
		         if (number < 0)
		        	 System.out.println("invalid");
		         else
		         {
		          int  sqrt = (int) Math.sqrt(number); 
		          int result=sqrt*sqrt;
		          if(result==number)
		        	  System.out.println(+number+ " is a square no");
		         
		          else 
		        	 System.out.println(+number +" is not a square no ");
		         }
		         
	}
	}


