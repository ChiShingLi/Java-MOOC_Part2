// part 2
//At creation, student has 0 study credits. Every time a student studies, amount of study credits goes up

public class Student extends Person {
//inherit from Person class for their and and address

    private int studyCredit;

    public Student(String name, String address) {
        super(name, address);
        studyCredit = 0;
    }

    public void study() {
        //increase count by 1
        this.studyCredit++;
    }

    public int credits() {
        return studyCredit;
    }

    //Overriding toString() method to use Student class method instead of Person's toString()
    @Override
    public String toString() {
        return (super.getName() + "\n  " + super.getAddress() + "\n  " + "Study credits " + studyCredit);
    }
}
