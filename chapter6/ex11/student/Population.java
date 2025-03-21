import java.util.Scanner;
public class Population{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double mexPop = 129.024;
        double usPop = 322.354;
        int iteration = 1;
        double mexIncrease, usDecrease;

        System.out.println("Enter the percent annual increase for Mexico population \nEnter as a decimal." +
            "\nFor example, 0.5% is entered as 0.005");
        System.out.print("Enter the value >> ");
        mexIncrease = keyboard.nextDouble();

        System.out.println("Enter the percent annual decrease for U.S. population \nEnter as a decimanl." 
            + "For example, 0.5% is entered as 0.005");
        System.out.print("Enter the value >> ");
        usDecrease = keyboard.nextDouble();

        System.out.println("  Mexico population       U.S. Population" + 
            "\n" + iteration + " " + mexPop + " million   " + usPop + " million");
        
        boolean dotsPrinted = false;
        int finalIteration = iteration;

        while (mexPop < usPop) {
            mexPop += mexPop * mexIncrease;
            usPop -= usPop * usDecrease;
            finalIteration++;
        }

        mexPop = 129.024;
        usPop = 322.354;
        iteration = 1;

        while(mexPop < usPop){
            ++iteration;
            mexPop += mexPop * mexIncrease;
            usPop -= usPop * usDecrease;
            if (iteration == 2) {
                System.out.println(iteration + " " + mexPop + " million   " + usPop + " million");
            } else if (iteration == finalIteration - 1) {
                System.out.println("...\n...\n...");
                System.out.println(iteration + " " + mexPop + " million   " + usPop + " million");
            } else if (iteration == finalIteration) {
                System.out.println(iteration + " " + mexPop + " million   " + usPop + " million");
            }
        }
        
        

        System.out.println("The population of Mexico will exceed the U.S. population in " + iteration + " years");
        System.out.println("The population of Mexico will be " + mexPop + " million" + 
            "\nand the population of the U.S. will be " + usPop + " million");

        keyboard.close();
    }
}
    