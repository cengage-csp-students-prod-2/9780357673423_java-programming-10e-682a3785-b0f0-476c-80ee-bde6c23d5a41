import java.util.Scanner;

public class Lease
{
    private String name;
    private int aptNumber;
    private double rent;
    private int term;

    public Lease()
    {
        this.name = "XXX";
        this.aptNumber = 0;
        this.rent = 1000;
        this.term = 12;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getAptNumber()
    {
        return aptNumber;
    }
    public void setAptNumber(int aptNumber)
    {
        this.aptNumber = aptNumber;
    }
    public double getRent()
    {
        return rent;
    }
    public void setRent(double rent)
    {
        this.rent = rent;
    }
    public double getTerm()
    {
        return term;
    }
    public void setTerm(int term)
    {
        this.term = term;
    }
    
    public void addPetFee()
    {
        this.rent += 10;
        explainPetPolicy();
    }

    public static void explainPetPolicy()
    {
        System.out.print("This $10 montly fee is included to any pet owners");
    }
}