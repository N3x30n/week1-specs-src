import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main (String[] args) throws InterruptedException{
        System.out.println("Why, Hello there. What is your name?");
        System.out.println("(Type in your name)");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();

        Random rand = new Random();
        int tries = 0;
        int number = rand.nextInt(100);
        System.out.println(playerName + ", I'm thinking of a number between 1 and 100");
        System.out.println("Try to guess my number");
        int guess = 0;
        while (true) {
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e){
                String badInput = input.next();
                System.out.println("That is not an integer :(. Please put in a valid number");
            }

            if (guess < 1 || guess > 100){
                System.out.println( guess + " is not a valid number :(. Please put in a number between 1 and 100");
            }
            tries += 1 ;

            if (guess < number) {
                System.out.println("Your guess is too low :(. Try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high :(. Try again.");
            } else {
                System.out.println("Well done " + playerName);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
        }
    }
}
