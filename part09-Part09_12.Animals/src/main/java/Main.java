
public class Main {

    public static void main(String[] args) {
        // part 2
//        Dog dog = new Dog();
//        dog.bark();
//        dog.eat();
//
//        Dog fido = new Dog("Fido");
//        fido.bark();

        // part 3
//        Cat cat = new Cat();
//        cat.purr();
//        cat.eat();
//
//        Cat garfield = new Cat("Garfield");
//        garfield.purr();
        // part 4
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }

}
