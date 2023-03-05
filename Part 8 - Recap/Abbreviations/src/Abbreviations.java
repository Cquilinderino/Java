import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> abbreviation;
    public Abbreviations() {
        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (!hasAbbreviation(abbreviation)) {
            this.abbreviation.put(abbreviation, explanation);
        } else {
            System.out.println("Abbreviation exists");
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviation.containsKey(abbreviation)) {
            return true;
        }

        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviation.get(abbreviation);
    }

}
