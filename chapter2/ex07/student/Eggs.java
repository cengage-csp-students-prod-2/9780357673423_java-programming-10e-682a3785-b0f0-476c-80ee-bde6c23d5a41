import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int eggsReq;
        int dozensOrdered;
        int looseEggs;
        double finalCost;

        System.out.print("Enter amount of eggs >> ");
        eggsReq = input.nextInt();

        dozensOrdered = (eggsReq / 12);
        looseEggs = (eggsReq % 12);
        finalCost = (dozensOrdered * 3.25) + (looseEggs * .45);
        
        System.out.print("You ordered " + eggsReq + " eggs. That's " + dozensOrdered + " dozen at $3.25 per dozen and "
        + looseEggs + " loose eggs at 45 cents each for a total of $" + finalCost);
    }
}