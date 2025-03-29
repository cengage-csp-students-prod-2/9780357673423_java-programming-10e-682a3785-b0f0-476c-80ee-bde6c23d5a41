import java.util.*;
public class ValidatePassword{
    public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    String aString;
    int upperCase = 0;
    int upperLimit = 2;
    int lowerCase = 0;
    int lowerLimit = 3;
    int digit = 0;
    int digitLimit = 1;

    System.out.print("Enter a string >> ");
    aString = kb.nextLine();


    for (int i = 0; i < aString.length(); i++) {
        char ch = aString.charAt(i);
        
        if (Character.isUpperCase(ch)) {
            upperCase++;
        } else if (Character.isLowerCase(ch)) {
            lowerCase++;
        } else if (Character.isDigit(ch)) {
            digit++;
        }
    }

    if(upperCase >= upperLimit && lowerCase >= lowerLimit && digit >= digitLimit){
        System.out.println("Valid password");
    } else {
        System.out.println("The password did not have enough: \n");
        if(digit < digitLimit){
        System.out.println("digits");
        }
        if(lowerCase < lowerLimit){
        System.out.println("lowercase letters");
        }
        if(upperCase < upperLimit){
        System.out.println("uppercase letters");
        }
    }
    kb.close();
}
}