/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author: Mini Sinha ms3114@scarletmail.rutgers.edu ms3114
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {

           double value1 = Double.parseDouble(args[0]);
           double value2 = Double.parseDouble(args[1]);
           double value3;
           for (int i = 2; i < args.length;) {
               if (value1 > value2) {
                value3 = value1;
                value1 = value2;
                value2 = value3;
                }
               double value4 = Double.parseDouble(args[i]);
               if (value1 > value4) {
                   value2 = value1;
                   value1 = value4;
               } else if (value2 > value4) {
                   value2 = value4;
               }
               i++;
           }           
           System.out.println(value1);
           System.out.println(value2);  
       }
   }



