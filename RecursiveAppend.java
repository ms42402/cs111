/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Mini Sinha ms3114@scarletmail.edu ms3114
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

    if (n <= 0) {
        return original;
    } else {
        return original + appendNTimes(original, n-1);    
    }

    }

    public static void main (String[] args) {

    // WRITE TEST CASES HERE to test your method
    String word = args[0];
    int times = Integer.parseInt(args[1]);
    appendNTimes(word, times);
    System.out.println(appendNTimes(word, times));
    }
}
