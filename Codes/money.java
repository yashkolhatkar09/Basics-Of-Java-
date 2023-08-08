import java.util.Scanner;
import java.text.*;
public class money
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter the buying price of share :  ");
        double BuyingPrice = sc.nextDouble();
        double ClosingPrice;
        int day = 1;

        do
        {
            System.out.print("Enter the Closing Price of Share (Enter a Negetive to stop the code) :") ;
            ClosingPrice = sc.nextDouble();

            if (ClosingPrice < 0)
            {
                break;
            }

            double Earnings = ClosingPrice - BuyingPrice;

            if (Earnings > 0)
            {
                System.out.print("Your Profits on day "+ day + " is " + df.format(Earnings) + " per share");
                System.out.println(""); // leaving line
                System.out.println(""); // leaving line
            }
            else if (Earnings < 0 )
            {
                System.out.print("Your Loss on day " + day + " is " + df.format(Earnings) + " per share");
                System.out.println(""); //leaving line
                System.out.println(""); //leaving line
            }

            else
            {
                System.out.print("You neither incurred loss nor gained profit on day "+day);
            }

            day++;
        }
        while (true);





    }
}
