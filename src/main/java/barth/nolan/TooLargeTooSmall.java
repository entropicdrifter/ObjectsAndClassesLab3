package barth.nolan;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by nolan on 1/14/16.
 */
public class TooLargeTooSmall {



        static private int hidden = ThreadLocalRandom.current().nextInt(1, 101);
        static boolean notWinning = true;
        static Scanner user_input = new Scanner(System.in);
        static private int guesses = 0;


        public static void main(String arg[]) {


            while (notWinning) {

                System.out.println("Guess a number between 1 and 100:");
                int user_guess = user_input.nextInt();
                guesses++;


                if (user_guess == hidden) {
                    System.out.println("Congratulations, you win!");
                    System.out.println("It took you " + guesses + " guesses to get the right number. \n" +
                            "See if you can do better next time!");
                    notWinning = false;
                }

                else if (user_guess > hidden) System.out.println("Guess lower...");

                else if (user_guess < hidden) System.out.println("Guess higher...");

                else System.out.println("How did you get this message?");


            }

        }


    }

