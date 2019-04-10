import java.util.Scanner;
/**
 * Write a description of class Part2 here.
 *
 * @author  Qurrat-al-Ain Siddiqui
 */
public class Part2
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        double intRate = 0.05; 
        int acctNum = keyboard.nextInt();
        
        System.out.println("Account   Opening   Interest   Closing");
        System.out.println("Number    Balance   Earned     Balance");
        while (acctNum >= 0)
        {
            double openBal = keyboard.nextDouble();
            double interest = openBal * intRate;
            double closeBal = openBal + interest;
            
            System.out.printf("%7d" ,acctNum);
            System.out.printf("%10.1f" , openBal);
            System.out.printf("%11.1f" , interest);
            System.out.printf("%10.1f" ,closeBal);
            
            acctNum = keyboard.nextInt();
        }
        
        System.out.println("Thank you for using the Interest Calculator");       
    }
}

