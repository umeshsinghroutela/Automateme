package practice.java.programe;

public class Factorial {
	public static void main(String[] args) {
		int num=5;
		
		System.out.println(findFactoral(num));
	}

	private static long findFactoral(int n) {
		
		if (n == 0 || n ==1) {
			return 1;
		}
		else{
			return n*findFactoral(n-1);
		}
	}
}
