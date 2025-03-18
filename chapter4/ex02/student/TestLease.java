import java.util.Scanner;

public class TestLease
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        Lease lease1, lease2, lease3, lease4;

        lease1 = getData(input);
        lease2 = getData(input);
        lease3 = getData(input);
        lease4 = new Lease();

        System.out.println("Hello");
        showValues(lease1);

        lease1.addPetFee();

        showValues(lease1);
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);

        input.close();
    }

    public static Lease getData(Scanner input)
    {
        

        System.out.print("Enter Tenant's name >> ");
        String name = input.nextLine();
        
        System.out.print("Enter apartment number >> ");
        int aptNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter monthly rent >> ");
        double rent = input.nextDouble();
        input.nextLine();

        System.out.print("Enter term >> ");
        int term = input.nextInt();
        input.nextLine();


        Lease lease = new Lease();
        lease.setName(name);
        lease.setAptNumber(aptNumber);
        lease.setRent(rent);
        lease.setTerm(term);

        return lease;
    }

    public static void showValues(Lease lease)
    {
        System.out.println("Your lease results:");
        System.out.println("Name       : " + lease.getName());
        System.out.println("Apartment  : " + lease.getAptNumber());
        System.out.println("Rent       : " + lease.getRent());
        System.out.println("Term       : " + lease.getTerm());
        System.out.println("");
    }
}