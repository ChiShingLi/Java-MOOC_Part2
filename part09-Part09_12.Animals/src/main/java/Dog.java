//part 2
public class Dog extends Animal {

    private String name;

    //default constructor
    public Dog() {
        //use super since Dog extends Animal class.
        super("Dog");
        this.name = "Dog";
    }

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " barks");
    }

}
