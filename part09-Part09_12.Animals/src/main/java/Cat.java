// part 3

public class Cat extends Animal {

    private String name;

    public Cat() {
        super("Cat");
        this.name = "Cat";
    }

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    public void purr() {
        System.out.println(this.name + " purrs");
    }

}
