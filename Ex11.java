package exercise_problems;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		System.out.println("to find the factorial of a no:");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int no=scan.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of "+no +" is "+fact);
	}

}
