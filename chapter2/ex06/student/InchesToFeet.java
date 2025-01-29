public class InchesToFeet {
    
    public static final int inches = 86;


    public static void main(String[] args) {
        int feet = inches / 12;
        int remaininginches = inches % 12;

        System.out.println(inches + " inches is " + feet + " feet and "
            + remaininginches + " inches");
    }
}