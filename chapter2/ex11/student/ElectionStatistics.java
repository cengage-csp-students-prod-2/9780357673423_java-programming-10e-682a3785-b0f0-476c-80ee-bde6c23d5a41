import java.util.Scanner;

public class ElectionStatistics
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        String firstParty, secondParty, thirdParty;
        double firstVotes, secondVotes, thirdVotes, totalVotes;

        System.out.print("Enter name for first party >> ");
        firstParty = input.nextLine();
        System.out.print("Enter votes received >> ");
        firstVotes = input.nextDouble();
        input.nextLine();

        System.out.print("Enter name for second party >> ");
        secondParty = input.nextLine();
        System.out.print("Enter votes received >> ");
        secondVotes = input.nextDouble();
        input.nextLine();

        System.out.print("Enter name for third party >> ");
        thirdParty = input.nextLine();
        System.out.print("Enter votes received >> ");
        thirdVotes = input.nextDouble();
        input.nextLine();

        totalVotes = firstVotes + secondVotes + thirdVotes;
        System.out.println("The " + firstParty + " party got " + ((firstVotes * 100) / totalVotes) + " percent of the vote");
        System.out.println("The " + secondParty + " party got " + ((secondVotes * 100) / totalVotes) + " percent of the vote");
        System.out.println("The " + thirdParty + " party got " + ((thirdVotes * 100) / totalVotes) + " percent of the vote");
    }
}