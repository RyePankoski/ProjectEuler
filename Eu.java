import java.util.HashSet;
import java.util.Set;

public class Eu {
	public static void main(String[] args) {
//By considering the terms in the Fibonacci sequence whose values 
//do not exceed four million, find the sum of the even-valued terms.

		Set<Integer> set = new HashSet<Integer>();
		int y = 0;
		int z = 0;
		int eval;

		for (int x = 1; x < 4000000;) {
			z = (x + y);

			eval = (z % 2);
			if (eval == 0)
				set.add(z);

			y = x;
			x = z;
		}

		int sum = 0;
		for (Integer e : set)
			sum += e;

		System.out.print(sum);
	}
}
