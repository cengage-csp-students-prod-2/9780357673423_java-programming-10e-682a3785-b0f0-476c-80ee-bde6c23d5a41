import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TenThousandDaysOld
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int birthMonth;
        int birthDay;
        int birthYear;

        System.out.print("Enter your birth month as an integer >> ");
        birthMonth = scanner.nextInt();
        System.out.print("Enter your birth day as an integer >> ");
        birthDay = scanner.nextInt();
        System.out.print("Enter your birth year as a four-digit integer >> ");
        birthYear = scanner.nextInt();
       
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate daysOld = birthDate.plusDays(10000);
       
        System.out.println("You are 10,000 days old on " + daysOld);
    }
}