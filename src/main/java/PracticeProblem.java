import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		String word = in.nextLine();

		System.out.println(word.charAt(0));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		boolean state = in.nextBoolean();
		in.nextLine();

		System.out.println(!state);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		int num1 = in.nextInt();
		in.nextLine();
		System.out.println(num1>5);

	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		double num2 = in.nextDouble();
		in.nextLine();
		System.out.println((-2 <= num2)&&(num2 <= 2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner (System.in);
		System.out.print("In: ");
		String word1 = in.nextLine();
		System.out.println(word1.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner (System.in);

		System.out.print("In: ");
		int num3 = in.nextInt();
		in.nextLine();

		System.out.print("In: ");
		int num4 = in.nextInt();
		in.nextLine();

		System.out.println(num3 <= num4);

	}

	public static void q7() {
		//Write question 7 code here
		Scanner in = new Scanner (System.in);

		System.out.print("In: ");
		double num5 = in.nextDouble();
		in.nextLine();

		System.out.print("In: ");
		double num6 = in.nextDouble();
		in.nextLine();

		System.out.println(num5 > num6);
	}

}
