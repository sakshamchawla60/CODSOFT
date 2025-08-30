import java.util.*;

public class human {
    public static void main(String[] args) {
        System.out.println("Welcome To Student Grade Calculator..");
        System.out.println("Enter The Number of Subjects");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        System.out.println("Enter The number of marks for each Subject");
        for (int i = 0; i < n; i++) {

            int marks = sc.nextInt();
            total = total + marks;
        }
        double percentage = total / n;
        System.out.println("Here is the Result");
        System.out.println("total=" + total);
        System.out.println("percentage=" + percentage);
        if (percentage == 100) {
            System.out.println("Grade: A+");
        } else if (percentage >= 90) {
            System.out.println("Grade: A");

        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Garde: C");
        } else if (percentage >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
            System.out.println("Better Luck Next Time.. ");
        }
        System.out.println("Thank You....");

    }
}
