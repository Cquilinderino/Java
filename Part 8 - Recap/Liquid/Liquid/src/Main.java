import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        System.out.println("Commands:");
        System.out.println("- 'add x' adds x to the first container");
        System.out.println("- 'move x' removes x from the first container and adds it to the second");
        System.out.println("- 'remove x' removes x from the second container");
        System.out.println("- 'quit' exits the program");

        while(true) {
            System.out.println("First container: " + first);
            System.out.println("Second container: " + second);

            String input = scanner.nextLine();

            if (input.equals("quit")){
                break;
            }

            String[] commands = input.split(" ");
            input = commands[0];
            int amount = Integer.valueOf(commands[1]);

            if (input.equals("add")) {
                first.add(amount);
            } else if (input.equals("move")) {
                first.remove(amount);
                second.add(amount);
            } else if (input.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}