import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        int numGuess = 0;
        System.out.println("Guess a number between 1 and 100, or enter \"q\" if you give up:");

        while (true) {
            input = scnr.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.print("Quitter! The number was 58");
                break;
            } else {
                int guess = Integer.parseInt(input);

                if (guess > 58) {
                    System.out.println("Too high, guess again:");

                }
                else if (guess < 58) {
                    System.out.println("Too low,guess again:");

                }
                else {
                    numGuess = numGuess + 1;
                    System.out.println("Correct!");
                    System.out.print("Number of Guesses: " + numGuess);
                    break;
                }
                numGuess = numGuess + 1;
            }
        }
    }
}
