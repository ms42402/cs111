/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Mini Sinha ms3114@scarletmail.rutgers.edu ms3114
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);
        int fourth = Integer.parseInt(args[3]);
        int fifth = Integer.parseInt(args[4]);

        if ((first > second) && (first > third) && (first > fourth) && (first > fifth)) {
            System.out.println(first);
        } else if ((second > first) && (second > third) && (second > fourth) && (second > fifth) ) {
            System.out.println(second);
        } else if ((third > first) && (third > second) && (third > fourth) && (third > fifth)) {
            System.out.println(third);
        } else if ((fourth > first) && (fourth > second) && (fourth > third) && (fourth > fifth)) {
            System.out.println(fourth);
        } else if ((fifth > first) && (fifth > second) && (fifth > third) && (fifth > fourth)) {
            System.out.println(fifth);
        } else {
            System.out.println("Error");
        }

    }
}