import java.util.Scanner;

public class NumbersDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOne;
        int numberTwo;

        System.out.print("Enter an integer >> ");
        numberOne = input.nextInt();
      
        
        System.out.print("Enter another integer >> ");
        numberTwo = input.nextInt();
        

        System.out.println(numberOne + " times 2 is " + displayTwiceTheNumber(numberOne));
        System.out.println(numberOne + " plus 5 is " + displayNumberPlusFive(numberOne));
        System.out.println(numberOne + " squared is " + displayNumberSquared(numberOne));
        
        System.out.println(numberTwo + " times 2 is " + displayTwiceTheNumber(numberTwo));
        System.out.println(numberTwo + " plus 5 is " + displayNumberPlusFive(numberTwo));
        System.out.println(numberTwo + " squared is " + displayNumberSquared(numberTwo));

        input.close();
    } 

        public static int displayTwiceTheNumber(int num){
           return num * 2;
        }
       
        public static int displayNumberPlusFive(int num){
            return num + 5;
        }
       
        public static int displayNumberSquared(int num){
            return num * num;
        }
    
}