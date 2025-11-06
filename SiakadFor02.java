import java.util.Scanner;

public class SiakadFor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade, highest = 0, lowest = 100;
        int passCount = 0, failCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = sc.nextDouble();

            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }

            if (grade >= 60) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("\nThe highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);

        sc.close();
    }
}
