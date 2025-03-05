import java.util.Scanner;

public class TwelveDays
{
    public static void main(String[] args)
    {
        int day;

        Scanner input = new Scanner(System.in);

        System.out.println("From what day do you want to start ");
        System.out.print("the song The Twelve Days of Christmas? >> ");
        day = input.nextInt();
        input.close();

    System.out.println("On the " + getDaySuffix(day) + " day of Christmas");
    System.out.println("My true love gave to me ");

    switch (day) {
        case 12:
            System.out.println("Twelve drummers drumming");
        case 11:
            System.out.println("Eleven pipers piping");
        case 10:
            System.out.println("Ten lords a-leeping");
        case 9:
            System.out.println("Nine ladies dancing");
        case 8:
            System.out.println("Eight maids a-milking");
        case 7:
            System.out.println("Seven swans a-swimming");
        case 6:
            System.out.println("Six geese a-laying");
        case 5:
            System.out.println("Five golden rings");
        case 4:
            System.out.println("Four calling birds");
        case 3:
            System.out.println("Three French hens");
        case 2:
            System.out.println("Two turtle doves and");
        case 1:
            System.out.println("A partridge in a pear tree");
            break;
    }
}

    private static String getDaySuffix(int day){
        if (day == 1) return "1st";
        else if (day == 2) return "2nd";
        else if (day == 3) return "3rd";
        else return day + "th";
        }
    }