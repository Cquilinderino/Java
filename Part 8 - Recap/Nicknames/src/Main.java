
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type 'exit' to terminate logging mode");

            System.out.print("Enter id of value: ");
            String id = scanner.nextLine();

            if (id.equals("exit")) {
                break;
            }

            System.out.print("Enter value: ");
            String value = scanner.nextLine();

            nicknames.put(id, value);
        }

        while (true) {
            System.out.println("Please enter id:");
            String id = scanner.nextLine();

            System.out.println(nicknames.get(id));
        }

    }
}