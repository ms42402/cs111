/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Mini Sinha ms3114@scarletmail.rutgers.edu ms3114
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		int[] array = new int[args.length];
		for (int i = 0; i < array.length; i++) {
			int n = Integer.parseInt(args[i]);
			if (n >= 1 && n <= array.length) {
				array[i] = n;
			}
		}

		for (int x = 0; x < array.length; x++) {
			for (int y = x + 1; y < array.length; y++) {
				if (array[x] == array[y]) {
					System.out.println("true");
					return;
				}

			}
		}
		System.out.println("false");

	}
}
