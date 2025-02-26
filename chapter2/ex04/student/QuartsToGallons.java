public class QuartsToGallons
{
    public static void main(String[] args)
    {
        int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int divide;
        int remainder;
        
        divide = quartsNeeded/QUARTS_IN_GALLON;
        remainder = quartsNeeded%QUARTS_IN_GALLON;

        System.out.print("A job that needs " + quartsNeeded + " quarts requires " + divide +
        " gallons plus " + remainder + " quarts");
        
    }
}