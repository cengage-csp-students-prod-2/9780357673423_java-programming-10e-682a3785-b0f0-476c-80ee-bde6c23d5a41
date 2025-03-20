import java.util.Scanner;
public class Perfect
{
    public static boolean isPerfect(int number)
    {
        int sum = 0;
        for(int i = 1; i <= number / 2; i++)
        {
            if(number % i == 0)
            {
                sum += i;
            }
        }
        return sum == number;
    }
    
    public static void findPerfectNumbers(int maxNum)
    {
        boolean found = false;
        for(int num = 1; num <= maxNum; num++)
        {
            if(isPerfect(num))
            {
                System.out.println("The number " + num + " is perfect");
                found = true;
            }
        }
        if(!found){
            System.out.println("No perfect numbers found.");
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a maximum number >> ");
        if(input.hasNextInt()){
            int maxNum = input.nextInt();
            if(maxNum >= 1){
                findPerfectNumbers(maxNum);
            } else {
                System.out.println("Please enter a number greater than 0.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        input.close();
    }
}