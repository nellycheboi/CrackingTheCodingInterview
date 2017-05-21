package recursion;

public class Fibonnaci {

	public static void main(String[] args) {
		puts(fib(1));
		puts(fib(2));
		puts(fib(3));
		puts(fib(5));
	}

	private static void puts(long n) {
		System.out.println(n);
	}

	private static void puts(double n) {
		System.out.println(n);
	}
/**
 * T(n) = T(n-1) + T(n-2) +1
 *       = (1.61803)^n
 *       exponential 
 *  Introduction to algorithms page 56,86
 * @param n
 * @return
 */
	public static long fibExponential(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibExponential(n - 1) + fibExponential(n - 2);
	}
	
	public static long fib(int n) {
		return (n<0)?-1: fib( n, 0,1,0);
	}

	private static long fib(int n, int last, int secondToLast, int i) {
		if(n==i){
			return last;
		}
		return fib(n,last+secondToLast,last,++i);
	}
}
