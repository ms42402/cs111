/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Mini Sinha ms3114@scarletmail.rutgers.edu ms3114
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {
    
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean A = ((Integer.parseInt(args[0]) == Integer.parseInt(args[1])) && (Integer.parseInt(args[1]) == Integer.parseInt(args[2])) && (Integer.parseInt(args[0]) == Integer.parseInt(args[2])));
        double AA = (11/5) * 3.0;
        //System.out.println(AA);
        //System.out.println((int)3.999);
        System.out.println("b" + "c");
	
    }
}
