public class MileConversions {
    public static final int INCHES_IN_MILE = 63360;
    public static final int FEET_IN_MILE = 5280;
    public static final int YARDS_IN_MILE = 1760;
    
    public static void main(String[] args){
        double miles = 2;


        double inches = miles * INCHES_IN_MILE;
        double feet = miles * FEET_IN_MILE;
        double yards = miles * YARDS_IN_MILE;

        System.out.println(miles + " miles in equivalent to:");
        System.out.println(inches + " inches");
        System.out.println(feet + " feet");
        System.out.println(yards + " yards");
    }
}