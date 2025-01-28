import java.util.Scanner;

public class MileConversions {
    public static final double INCHES_IN_MILE = 63360;
    public static final double FEET_IN_MILE = 5280;
    public static final double YARDS_IN_MILE = 1760;

    public static main(String[] args) {
        float miles = input.nextDouble();

        double inches = miles * INCHES_IN_MILE;
        double feet = miles * FEET_IN_MILE;
        double yard = miles * YARDS_IN_MILE;
    }
}
