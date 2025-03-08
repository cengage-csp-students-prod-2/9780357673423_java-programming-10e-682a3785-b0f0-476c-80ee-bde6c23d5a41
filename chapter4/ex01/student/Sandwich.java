import java.util.Scanner;

public class Sandwich
{
    String mainIngredient;
    String bread;
    double price;

    public Sandwich()
    {
        this.mainIngredient = "";
        this.bread = "";
        this.price = 0.0;
    }

    public String getMainIngredient()
    {
        return mainIngredient;
    }
    public void setMainIngredient(String mainIngredient)
    {
        this.mainIngredient = mainIngredient;
    }
    public String getBread()
    {
        return bread;
    }
    public void setBread(String bread)
    {
        this.bread = bread;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

}