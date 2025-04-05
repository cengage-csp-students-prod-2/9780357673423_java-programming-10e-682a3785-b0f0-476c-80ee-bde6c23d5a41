import java.util.*;
public class DistanceFromAverage{
    public static void main(String[] args){
        final int MAX = 15;
        final int QUIT = 99999;
        double[] distances = new double[MAX];
        int count = 0;
        double sum = 0;
        
        Scanner input = new Scanner(System.in);
        double entry;

        System.out.print("Enter a numeric value or 99999 to quit >> ");
        entry = input.nextDouble();

        while(entry != QUIT && count < MAX){
            distances[count] = entry;
            sum += entry;
            count++;
            System.out.print("Enter next numeric value or 99999 to quit >> ");
            entry = input.nextDouble();
        }

        if(count == 0){
            System.out.println("You must enter a numeric value.");
        }else{
            double average = sum / count;
            System.out.println("You entered " + count + " numbers and their average is " + average);

            for(int i = 0; i < count; i++){
                double difference = distances[i] - average;
                System.out.println(distances[i] + " is " + difference + " away from the average");
            }
        }
    }
}