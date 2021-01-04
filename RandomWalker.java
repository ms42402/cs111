/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Mini Sinha ms3114@scarletmail.rutgers.edu ms3114
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double distance = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int w = 0;

        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;
        System.out.println("(0,0)");

        for (int i =0; i < n; i++) {
            double number = Math.random();
            if (number <= 0.25){
                east++;
            } else if (number <= 0.50) {
                west++;
            } else if (number <= 0.75) {
                north++;
            } else {
                south++;
            }
            x = east - west;
            y = north - south;
            System.out.println("(" + x + "," + y + ")");
            double length = Math.sqrt((x*x) + (y*y));
            distance += length;
            z = x;
            w = y;
        }
        distance = (x*x) + (y*y);
        System.out.println("Square distance = " + distance);

    }
}
