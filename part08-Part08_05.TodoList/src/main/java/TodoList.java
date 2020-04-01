
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> workList;

    public TodoList() {
        this.workList = new ArrayList<>();
    }

    //add the task passed as a parameter to the todo list.
    public void add(String task) {
        workList.add(task);
    }

    //prints the exercises. 
    public void print() {
        for (int i = 0; i < workList.size(); i++) {
            System.out.println((i + 1) + ": " + workList.get(i));
        }
    }

    //removes the task associated with the given number.
    //the number is the one seen associated with the task in the print.
    public void remove(int number) {
        workList.remove(number - 1);
    }

}
