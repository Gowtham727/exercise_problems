package exercise_problems;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		System.out.println("to find the number is odd or even");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		
		int no=scan.nextInt();
		if(no%2==0)
			System.out.println("the no is even "+no);
		else 
			System.out.println("the no is odd "+no);
		
	
	}

}
