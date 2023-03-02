import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int i = 0;

        while (true) {
            System.out.println("Enter a number: (input 0 when you're done");

            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num < 0) {
                total = total;
            } else {
                total += num;
                i++;
            }
        }

        double average = 1.0 * total / i;

        if (i == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average is: " + average);
        }
    }
}
