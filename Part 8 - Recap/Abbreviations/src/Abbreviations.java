import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> abbreviation;
    public Abbreviations() {
        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {

    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviation.containsKey(abbreviation)) {
            System.out.println("Abbreviation exists");
            return true;
        }

        System.out.println("Abbreviation does not exist");
        return false;
    }

    public String findExplanation(String abbreviation) {

    }

}
