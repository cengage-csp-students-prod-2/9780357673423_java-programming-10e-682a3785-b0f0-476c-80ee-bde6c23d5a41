import java.util.Scanner;

public class AcmePay{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        final double FIRST_SHIFT_RATE = 17.00;
        final double SECOND_SHIFT_RATE = 18.50;
        final double THIRD_SHIFT_RATE = 22.00;
        final double OVERTIME = 1.5;
        final double RETIREMENT_PERCENTAGE = 0.03;
        final int REG_HOURS = 40;
        
        int shift;
        double hoursWorked, hourlyRate = 0, regularPay, overtimePay = 0, totalPay, retirementDed = 0, netPay;
        boolean retirementPlan = false;
    
        System.out.print("Please enter shift - 1, 2, or 3 >> ");
        shift = input.nextInt();
        if(shift == 1){
            hourlyRate = FIRST_SHIFT_RATE;
        } else if(shift == 2){
            hourlyRate = SECOND_SHIFT_RATE;
        } else if(shift == 3){
            hourlyRate = THIRD_SHIFT_RATE;
        }
        
        System.out.print("Please enter hours worked (can be a fraction) >> ");
        hoursWorked = input.nextDouble();

        if(shift == 2 || shift == 3){
            System.out.print("Do you want to participate in the retirement plan?" +
                "Enter 1 for Yes and 2 for No >> ");
            int retirementChoice = input.nextInt();
            if(retirementChoice == 1){
                retirementPlan = true;
            }
        }
    
 

        if(hoursWorked > REG_HOURS){
            regularPay = REG_HOURS * hourlyRate;
            overtimePay = (hoursWorked - REG_HOURS) * hourlyRate * OVERTIME;
        } else {
            regularPay = hoursWorked * hourlyRate;
        }
        totalPay = regularPay + overtimePay;

        if(retirementPlan){
            retirementDed = totalPay * RETIREMENT_PERCENTAGE;
        }
        netPay = totalPay - retirementDed;

        System.out.println("Hours worked is " + hoursWorked);
        System.out.println("Shift:          " + shift);
        System.out.println("Hourly pay rate is " + hourlyRate);
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
        System.out.println("Retirement deduction is " + retirementDed);
        System.out.println("       Net pay is..................." + netPay);
    }
}