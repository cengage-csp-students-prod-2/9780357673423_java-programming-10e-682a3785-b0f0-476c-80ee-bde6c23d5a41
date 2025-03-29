import java.util.*;
public class CountWords
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a string >> ");
        String quote = kb.nextLine().trim();

        String cleanedQuote = quote.replaceAll("[^a-zA-Z0-9'\\- ]", "").trim();

        int wordCount = cleanedQuote.isEmpty() ? 0 : cleanedQuote.split("\\s+").length;

        System.out.println("There are " + wordCount + " words in the string");

        kb.close();
    }
}