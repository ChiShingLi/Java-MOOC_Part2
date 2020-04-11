
public class MainProgram {

    public static void main(String[] args) {
        //part 1
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);

    }
}
