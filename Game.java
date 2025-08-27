import java.util.*;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usernumber = 0;
        int attempts = 0;
        int guessnumber = (int) (Math.random() * 100) + 1;
        System.out.println("Welcome to the Guess Game!!..");
        System.out.println("In this game you will Guess Number.. ");

        do {
            System.out.println("Enter the Usernumber");
            usernumber = sc.nextInt();
            attempts++;
            if (usernumber == guessnumber) {
                System.out.println("Number is  Guessed");
                System.out.println("You have guessed the number in "+attempts + " attempts.");

            } else if (usernumber > guessnumber) {
                System.out.println("no. is to high  , please generate the samller number");
            } else if (usernumber < guessnumber) {
                System.out.println("no is to small, please generate the greater number");
            } else {
                System.out.println("invalid option");

            }
        } while (usernumber != guessnumber);
        System.out.println("Thank You..");
        System.out.println("Please Visting Again");

    }

}
