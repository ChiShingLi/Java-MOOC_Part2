//part 4 - Teacher inherit from Person class

public class Teacher extends Person {


    private int salary;

    public Teacher(String name, String address, int salary) {
        //pass the name and address to the superclass (Person)
        super(name, address);
        this.salary = salary;
    }

    //override .toString to call this function
    @Override
    public String toString() {
        return (super.getName() + "\n  " + super.getAddress() + "\n  " + "salary " + salary + " euro/month");

    }

}
