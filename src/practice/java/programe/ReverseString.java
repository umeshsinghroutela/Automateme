package practice.java.programe;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the String ");
		String str = sc.nextLine();

		System.out.println("reversed String is ->>\n"+ reverseString(str));

		//reverse by Word
		System.out.println("reversed Word is ->>\n" + reversebyWord(str));

		sc.close();
	}

	private static String reversebyWord(String str) {
		String revWord="";
		String[] strInArr = str.split(" ");
		for (int i = strInArr.length-1; i>=0 ; i--) {
			revWord = revWord +  strInArr[i] +" ";
		}
		return revWord.trim();
	}

	private static String reverseString(String str) {

		String revStr ="" ;
		for (int i = str.length()-1; i >=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;

	}

}
