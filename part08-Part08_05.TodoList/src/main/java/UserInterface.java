
import java.util.Scanner;

public class UserInterface {

    private TodoList workList;
    private Scanner scan;

    public UserInterface(TodoList workList, Scanner scan) {
        this.workList = workList;
        this.scan = scan;
    }

    public void start() {

        while (true) {
            //ask user inputs
            System.out.print("Command: ");
            String command = scan.nextLine();

            //stops the execution of the loop.
            if (command.equals("stop")) {
                break;
            }

            //asks the user for the next task to be added.
            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scan.nextLine();
                workList.add(task);
            }

            //prints all the tasks on the to-do list.
            if (command.equals("list")) {
                workList.print();
            }

            //asks the user to enter the id of the task to be removed.
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int input = Integer.valueOf(scan.nextLine()); //convert String into int
                workList.remove(input);
            }

        }

    }

}
