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

        double value = 1; // 1 = mode for other program
           double value1 = Double.parseDouble(args[0]); //forecast 0
           double value2 = Double.parseDouble(args[1]); //forecast 1
           double value3;
           for (int i = 2; i < args.length; i++) {
               if (value1 > value2) {   // forecast 0 and forecast 1
                value3 = value1;        
                value1 = value2;       /// value 1 is the lesser number
                value2 = value3;       // value 2 is the greater number 
                }
               double value4 = Double.parseDouble(args[i]);
               if (value1 > value4) { 
                   value2 = value1;  ///value 2 is the greater number 
                   value1 = value4; //valye 1 is the lesser number 
               } else if (value2 > value4) {
                   value2 = value4; //value 2 is the lesser number 
               }
           }           
           System.out.println(value1);
           System.out.println(value2);  
       }
   }



