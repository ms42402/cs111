/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Mini Sinha ms3114@scarletmail.rutgers.edu ms3114
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        long digit = Long.parseLong(args[0]);
        long i = 0;
        long sum1 = 0;
        long sum2 = 0;
        long right = 0;
        long right2 = 0;
        while (i <= 6) {
            right = digit % 10;
            sum1 = right + sum1;
            digit = digit / 10;
            right2 = digit % 10;
            sum2 = right2 + sum2;
            digit = digit / 10;
            i++;
        }
        sum1 = sum1 % 10;
        sum2 = sum2 % 10;
        sum2 = sum2 * 3;
        sum2 = sum2 % 10;
        long sum = sum1 + sum2;
        sum = sum % 10;
        System.out.println(sum);

    }
}