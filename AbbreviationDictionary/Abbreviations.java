import java.util.HashMap;
import java.util.Locale;

public class Abbreviations {
    private HashMap<String,String> abbreviationsHashMap;
    private StringManager myStringManager;

    public Abbreviations()
    {
        this.abbreviationsHashMap = new HashMap<>();
        this.myStringManager = new StringManager();
    }

    public void addAbbreviation(String abbreviation, String meaning)
    {
        this.abbreviationsHashMap.put(abbreviation,meaning);
    }

    public boolean hasAbbreviation(String abbreviation)
    {

        if(this.abbreviationsHashMap.get(this.myStringManager.start(abbreviation)) != null)
            return true;
        else
            return false;
    }

    public String findExplainationFor(String abbreviation)
    {
        return this.abbreviationsHashMap.get(this.myStringManager.start(abbreviation));
    }
}
