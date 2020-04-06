
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class DictionaryOfManyTranslations {

    //create a HashMap and word have a list of translations
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }

    //adds the translation for the word and preserves the old translations.
    public void add(String word, String translation) {

        //if the word is not found in the dictionary, create a new instance
        if (!(dictionary.containsKey(word))) {
            //initial ArrayList
            dictionary.put(word, new ArrayList<>());

        }

        //get the object and add translations to the ArrayList
        dictionary.get(word).add(translation);
    }

    /*
    returns a list of the translations added for the word. 
    If the word has no translations, the method should return an empty list.
     */
    public ArrayList<String> translate(String word) {
        //if the word doesn't exist in the dictionary
        if (dictionary.get(word) == null) {
            //return an empty list
            return new ArrayList<>();
        }
        return (dictionary.get(word));

    }

    //removes the word and all its translations from the dictionary.
    public void remove(String word) {
        dictionary.remove(word);

    }

}
