import java.util.Scanner;

public class TestSandwich
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the main sandwich ingredient >> ");
        String mainIngredient = input.nextLine();

        System.out.print("Enter bread type >> ");
        String bread = input.nextLine();

        System.out.print("Enter sandwich price >> ");
        double price = input.nextDouble();

        Sandwich sandwich = new Sandwich();
        sandwich.setMainIngredient(mainIngredient);
        sandwich.setBread(bread);
        sandwich.setPrice(price);

        System.out.print("You have ordered a " + sandwich.getMainIngredient() + " sandwich on " + 
           sandwich.getBread() + " bread, and the price is " + sandwich.getPrice());

        input.close();
    }
}