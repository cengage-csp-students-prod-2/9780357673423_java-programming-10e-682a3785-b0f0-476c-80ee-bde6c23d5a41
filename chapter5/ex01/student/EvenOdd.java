import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number >> ");
        number = input.nextInt();

        if(isEven(number)){
            System.out.print(number + " is even");
        } else {
            System.out.print(number + " is odd");
        }
        input.close();

    }

        public static boolean isEven(int num){
            return num % 2 == 0;
        }
}