import java.util.*;
public class CountWords
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String quote = "";
        
        System.out.print("Enter a string >> ");
        quote = kb.nextLine();

        String cleanedQuote = quote.replaceAll("[-!?;.,^a-zA-Z0-9' ]", "");

        int wordCount = cleanedQuote.isEmpty() ? 0 : cleanedQuote.trim().split("\\s+").length;

        System.out.println("There are " + wordCount + " words in the string");

        kb.close();
    }
}