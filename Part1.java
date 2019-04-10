import java.util.Scanner;
/**
 * 
 * @author  Qurrat-al-Ain Siddiqui
 * 
 */

public class Part1 
{
    
    public static void main()
    {
        Scanner keyboard = new Scanner (System.in);
        int number;     // an inputted number
        int sum;        // the sum of the numbers entered
        
        sum = 0;
        System.out.print("Please enter a number or -1 to end > ");
        number = keyboard.nextInt();    // the priming read
        while (number >= 0)             
        {
            System.out.println ("The entered number is " + number);
            sum = sum + number;
            System.out.println ("The running sum is " + sum);
            System.out.print("Please enter a number or -1 to end > ");
            number = keyboard.nextInt();    // the internal read 
            
        }
        System.out.println ("The final sum is " + sum);
        System.exit(0);
    }
    
}