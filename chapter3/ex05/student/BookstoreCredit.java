import java.util.Scanner;

public class BookstoreCredit{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name;
        double gpa;
        double credit;

        System.out.print("Enter your name >> ");
        name = input.nextLine();

        System.out.print("Enter your gpa >> ");
        gpa = input.nextDouble();
        credit = computeDiscount(gpa);
        System.out.println(name + ", your GPA is " + gpa + ", so your credit is $"
        + credit);
    }
        public static double computeDiscount(double gpa){
            return (gpa * 10);
        }
    
}