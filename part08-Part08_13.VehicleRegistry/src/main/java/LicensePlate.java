
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    // overriding the .hashCode() and .equals()
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.liNumber);
        hash = 89 * hash + Objects.hashCode(this.country);
        return hash;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }

        // if its not LicensePlate Object
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        //convert the object to LicensePlate object and compare
        LicensePlate comparingObject = (LicensePlate) comparedObject;

        if ((this.country.equals(comparingObject.country)) && (this.liNumber.equals(comparingObject.liNumber))) {
            return true;
        }

        return false;
    }

}
