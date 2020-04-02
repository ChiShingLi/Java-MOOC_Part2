
import java.util.HashMap;
//class for managing common abbreviations.

public class Abbreviations {

    private HashMap<String, String> abbreviationMap;

    public Abbreviations() {
        abbreviationMap = new HashMap<>();
    }

    // adds a new abbreviation and its explanation.
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationMap.put(abbreviation, explanation);
    }

    // checks if an abbreviation has already been added; 
    // returns true if it has and false if it has not.
    public boolean hasAbbreviation(String abbreviation) {
        //check if the HashMap contains the key
        //get rid of any whitespaces
        return this.abbreviationMap.containsKey(abbreviation);
    }

    // finds the explanation for an abbreviation
    // returns null if the abbreviation has not been added yet.
    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation) == false) {
            return null;
        } else {
            return this.abbreviationMap.get(abbreviation);
        }
    }

}
