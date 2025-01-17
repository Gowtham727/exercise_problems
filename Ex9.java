package exercise_problems;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		System.out.println("to find the sum of N numbers:");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no:");
		int sum=0;
		int no=scan.nextInt();
		for(int i=1;i<no;i++)
		{
			sum=sum+i;
		}
		System.out.println("the sum of N no is "+sum);
			

	}

}
