import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        UserInterface ui = new UserInterface(list, scanner);

        ui.start();
    }
}