import java.util.Scanner;

public class Percentages{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double numberOne;
        double numberTwo;

        System.out.print("Enter a double >> ");
        numberOne = input.nextDouble();
        System.out.print("Enter another double >> ");
        numberTwo = input.nextDouble();
        System.out.println(numberOne + " is " + computePercent(numberOne, numberTwo) + 
        " percent of " + numberTwo);
        System.out.println(numberTwo + " is " + computePercent(numberTwo, numberOne) + 
        " percent of " + numberOne);

    }

    public static double computePercent(double one, double two){
        return ((one / two) * 100);
    }
}