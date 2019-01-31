import java.util.Random;
import java.util.Scanner;

/** Code orginally from John Foley
 * Scourse Link: https://gist.github.com/jjfiv/767a8041868caae861278659abc063ac
*/
public class GuessingGame {
    /**
     * A Java program wil run code in a special "main" method.
     * Note: Java has 2 types of comments: block (slash-star ... star-slash), and line ("slash-slash") comments.
     * For now we ignore args, which is an array of strings that the user might have passed in.
     * @param args command line arguments
     */
    public static void main(String[] args) {
    	final int HIGH = 100;
		final int LOW = 0;
		
		// Create a random number generator:
		Random rand = new Random();
		
		//Select a secret number.
		final int secretNumber = rand.nextInt(HIGH - LOW) +LOW;
		System.out.println("Welcome to the Guessing Game!");
		System.out.println("I've picked a secret number between ["+LOW+","+HIGH+").");
		
		//Set the current guess to something that can't be correct.
		int guess = LOW -1;
		
    }
}
