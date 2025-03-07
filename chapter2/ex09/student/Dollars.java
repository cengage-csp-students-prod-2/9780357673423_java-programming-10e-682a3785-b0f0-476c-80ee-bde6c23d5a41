import java.util.Scanner;

public class Dollars
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int dollars, twenties, tens, fives, ones, rem;


        System.out.print("Enter a number of dollars ");
        dollars = input.nextInt();
        twenties = (dollars / 20);
        rem = dollars % 20;
        tens = (rem / 10);
        rem = rem % 10;
        fives = (rem / 5);
        rem = rem % 5;
        ones = rem;

        System.out.println("$" + dollars + " converted is " + twenties + " $20s, " + tens + " $10s, " + 
            fives + " $5s, and " + ones + " $1s");
        
    }
}