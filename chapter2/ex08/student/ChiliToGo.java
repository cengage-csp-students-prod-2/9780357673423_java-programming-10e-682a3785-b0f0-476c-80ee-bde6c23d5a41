    import java.util.Scanner;
public class ChiliToGo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int adultMeals;
        int childMeals;
        double adultTotal;
        double childTotal;
        double grandTotal;

        System.out.print("Enter number of adult meals ordered >> ");
        adultMeals = input.nextInt();
        System.out.print("Enter number of child meals ordered >> ");
        childMeals = input.nextInt();
        input.nextLine();

        adultTotal = (adultMeals * 7.0);
        childTotal = (childMeals * 4.0);
        grandTotal = (adultTotal + childTotal);
        System.out.println(adultMeals + " adult meals were ordered at $7.0 each.");
        System.out.println("   Total is $" + adultTotal);
        System.out.println(childMeals + " child meals were ordered at $4.0 each.");
        System.out.println("   Total is $" + childTotal);
        System.out.println("Grand total for all meals is $" + grandTotal);
    }
}