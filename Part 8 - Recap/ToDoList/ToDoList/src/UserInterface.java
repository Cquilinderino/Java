import java.util.Scanner;
public class UserInterface{
    private ToDoList list;
    private Scanner scanner;

    public UserInterface(ToDoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("***Commands***");
        System.out.println("add: adds a book to the list");
        System.out.println("remove: removes an entry from the list");
        System.out.println("list: prints out all the books in the list");

        System.out.println();

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
            list.add(item);
        } else if (command.equals("remove")) {
            System.out.print("To remove (id number): ");

            try {
                int item = scanner.nextInt();
                list.remove(item);
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

        } else if (command.equals("list")) {
            list.print();
        }
    }
}
