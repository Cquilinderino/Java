import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Number to cube: ('end' terminates the program)");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            int toCube = Integer.valueOf(input);

            System.out.println((toCube * toCube * toCube));
        }
    }
}