import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Balachandran
 *
 */
public class Fibonacci {
	static int fib(int n)
	{
		if (n <= 2)
			return n;
		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		//System.out.println(input);
		String num[] = input.split(" ");

		int n = Integer.parseInt(num[num.length-1]);
		System.out.println(fib(n));
	}
}
