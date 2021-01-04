/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Mini Sinha ms3114@scarletmail.rutgers.edu ms3114
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int[][] movieRatings;
		int r = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[1]);
		movieRatings = new int[r][c];
		int sum = 0;
		int value1 = 0;
		int value2 = 0;
		int sum2 = 0;
	
		for (c = 0; c < movieRatings[0].length; c++) {
			for ( r = 0; r < movieRatings.length; r++){
				value1 = movieRatings[r][c];
				sum = value1 + sum; 
				System.out.println(sum);
			}
				}
		


		}
	}



		