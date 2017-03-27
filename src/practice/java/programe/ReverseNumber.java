package practice.java.programe;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to reverse");
		int num = sc.nextInt();
		
		System.out.println(reverseNumber(num));
		sc.close();
	}

	private static int reverseNumber(int num) {
		int q = num;
		int rem;
		int sum =0;
		
		while(q>0)
		{
			rem = q%10;
			q=q/10;
			sum = sum*10+ rem;
		}
		
		
		return sum;
		
	}

}
