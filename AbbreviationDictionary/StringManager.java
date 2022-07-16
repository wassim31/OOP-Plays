import java.util.Locale;

public class StringManager {
    private String managedString;

    public String start(String input)
    {
        this.managedString = input.toLowerCase(Locale.ENGLISH);
        this.managedString = this.managedString.trim();
        return this.managedString;

    }

}
