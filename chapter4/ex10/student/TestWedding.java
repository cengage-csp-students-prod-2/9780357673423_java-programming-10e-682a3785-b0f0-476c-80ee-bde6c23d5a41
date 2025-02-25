import java.util.Scanner;
import java.time.LocalDate;
public class TestWedding
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
       int wedDay, wedMonth, wedYear;
       String brideFirstName, brideLastName, groomFirstName, groomLastName;
        String location;

       System.out.print("Enter the month of wedding ");
       wedMonth = input.nextInt();
       System.out.print("Enter day of wedding ");
       wedDay = input.nextInt();
       System.out.print("Enter year of wedding ");
       wedYear = input.nextInt();
       input.nextLine();

       System.out.print("Enter first name of bride >> ");
       brideFirstName = input.nextLine();
      System.out.print("Enter last name of bride >> ");
        brideLastName = input.nextLine();
      System.out.print("Enter first name of groom >> ");
      groomFirstName = input.nextLine();
      System.out.print("Enter last name of groom >> ");
      groomLastName = input.nextLine();
       System.out.print("Enter location of wedding >> ");
      location = input.nextLine();


     Person bride = new Person(brideFirstName, brideLastName);
     Person groom = new Person(groomFirstName, groomLastName);
     Couple couple = new Couple(bride, groom);
     LocalDate weddingDate = LocalDate.of(wedYear, wedMonth, wedDay);
     Wedding wedding = new Wedding(couple, weddingDate, location);

    System.out.println();
    System.out.println(brideLastName + "/" + groomLastName + " Wedding");
    System.out.println("Date: " + wedding.getWeddingDate() + "  Location: " + wedding.getLocation());
    System.out.println("Bride: " + brideFirstName + " " + brideLastName);
    System.out.println("Groom: " + groomFirstName + " " + groomLastName);
    
    }
}