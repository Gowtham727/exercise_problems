package exercise_problems;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println("to find how many dozen recieved in the hospital:");
		int total=1193;
		int remaining=0;
		int dozen=12;
		int result=total/dozen;
		System.out.println("the total dozen recieved is "+result);
		remaining=total-(result*12);
		System.out.println("the remaining no of packets is "+remaining);
		

	}

}
