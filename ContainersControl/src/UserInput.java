import java.util.Locale;
import java.util.Scanner;
public class UserInput {
    private String command;
    private int amount;

    public String getCommand() {
        return this.command;
    }

    public int getAmount() {
        return this.amount;
    }

    public void get()
    {
        Scanner myScanner = new Scanner(System.in);
        String[] parts;
        do {
            String myString = myScanner.nextLine(); // add 5
            parts = myString.split(" ");
            this.command = parts[0].toLowerCase(Locale.ENGLISH);
            this.amount = Integer.parseInt(parts[1]);

        } while(Integer.parseInt(parts[1]) <= 0 || Integer.parseInt(parts[1]) > 100);



    }
}
