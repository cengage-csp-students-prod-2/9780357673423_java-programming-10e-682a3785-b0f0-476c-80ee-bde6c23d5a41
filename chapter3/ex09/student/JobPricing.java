import java.util.Scanner;

public class JobPricing
{
public static void main(String[] args)
{
    String job_desc;
    double hours_worked;
    double material_cost;
    double hours_traveled;

    Scanner input = new Scanner(System.in);
    System.out.print(" Enter job description >> ");
    job_desc = input.nextLine();
    System.out.print("Enter cost of materials >> ");
    material_cost = input.nextDouble();
    System.out.print("Enter hours on the job work >> ");
    hours_worked = input.nextDouble();
    System.out.print("Enter hours traveling >> ");
    hours_traveled = input.nextDouble();

    double estimated_price = computePrice(hours_worked, material_cost,
    hours_traveled);

    System.out.print("The price for " + job_desc + " is $" + estimated_price);

    }
    public static double computePrice(double hw, double mc, double ht)
    {

    return (mc + (hw * 35) + (ht * 12));
    }
}