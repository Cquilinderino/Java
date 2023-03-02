import java.util.Scanner;
public class UserInterface extends ToDoList{
    private ToDoList list;
    private Scanner scanner;

    public UserInterface(ToDoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            command(command);
        }
    }

    public void command(String command) {
        if (command.equals("add")) {
            System.out.print("To add: ");
            String item = scanner.nextLine();
            super.add(item);
        } else if (command.equals("remove")) {
            System.out.print("To remove (id number): ");

            try {
                int item = scanner.nextInt();
                super.remove(item);
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

        } else if (command.equals("list")) {
            super.print();
        }
    }
}
