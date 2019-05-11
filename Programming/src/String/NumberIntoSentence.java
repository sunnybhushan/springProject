package String;

import java.util.Scanner;

public class NumberIntoSentence {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		nTow(no/10000000, "Crore");
		nTow(no/100000 % 100, "Lakh");
		nTow(no/1000 % 100, "Thousand");
		nTow(no/100 % 10, "Hundred");
		nTow(no%100, "");
	}

	static void nTow(int n, String st) {
		String one[] = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ",
				"eleven ", "twelve ", "thirteen ", "forteen ", "fifteen", "sixteen", "seventeen", "eighteen",
				"ninteen" };
		String two[] = { "", "", "Twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninty " };

		if (n < 20) {
			System.out.print(one[n]);
		} else {
			System.out.print(two[n/10] + one[n%10]);
		}
		if (n != 0) {
			System.out.print(st + " ");
		}

	}

}

