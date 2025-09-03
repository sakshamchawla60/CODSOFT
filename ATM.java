import java.util.*;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Welcome to Punjab National Bank");
        System.out.println("How can I help you!!..");
        int pin = 3009;
        int Balance = 2000;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);
        while (attempts < 3) {
            System.out.println("Enter Your Pin: ");

            int userpin = sc.nextInt();
            if (userpin == pin) {
                System.out.println("Access Granted");
                boolean exit = false;
                while (!exit) {
                    System.out.println("Select the option...");
                    System.out.println("1. Check the Balance");
                    System.out.println("2. Withdrawal Cash");
                    System.out.println("3. Deposit Cash");
                    System.out.println("4. Exit");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("You have choose to check your Balance: ");
                            System.out.println("Here is your account Balance " + Balance);
                            break;
                        case 2:
                            System.out.println("You have Choose to Withdrawal your Cash: ");
                            System.out.println("How much  Cash you would withdraw:");
                            int withdrawal = sc.nextInt();
                            Balance = Balance - withdrawal;
                            System.out.println("You have Successfully withdrawal " + withdrawal + " from your account");
                            break;
                        case 3:
                            System.out.println("You have Choose to Deposit your Cash:");
                            System.out.println("How much Cash you would Deposit:");
                            int deposit = sc.nextInt();
                            Balance = Balance + deposit;
                            System.out.println("You have Successfully deposited " + deposit + " from your account");
                            break;
                        case 4:
                            System.out.println("Thank you for choosing Us..");
                            exit = true;
                            break;

                    }
                }
                break;
            } else {
                attempts++;
                System.out.println("Incorrect Userpin...... Attempts remaining: " + (3 - attempts));

            }
            if (attempts == 3) {
                System.out.println("Too many incorrect attempts ....... account Locked");
            }

        }
    }

}
