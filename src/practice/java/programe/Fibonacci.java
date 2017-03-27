package practice.java.programe;

public class Fibonacci  {
	public static void main(String[] args) {
		int n= 10;
		int i=0;
		while (i<=n) {
			System.out.println(fib(i));
			i++;
		}
	}

	private static int fib(int n) {
		if (n ==0) {
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else{
			return fib(n-2)+fib(n-1);
		}
	}
} 


//0
//1
//1
//2
//3
//5
//8
//13
//21
//34
//55
