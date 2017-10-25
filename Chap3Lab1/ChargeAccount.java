
import java.util.Scanner;
import java.text.NumberFormat;

public class ChargeAccount
{
    public static void main (String[] args) {
        double previousBalance;
        double charges;
        double newBalance=0;
        double minPayment=0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter current balance: ");
        previousBalance = scan.nextDouble();
        System.out.print("Enter any additional charges: ");
        charges = scan.nextDouble();
        
        if (previousBalance == 0.0) {
        newBalance = previousBalance + charges;
        }
        else{
        newBalance = previousBalance + charges + (0.02 * previousBalance);
        }
        
        if (newBalance < 50) {
            minPayment = newBalance;
        }
        else if (newBalance >= 50 && previousBalance < 300) {
            minPayment = 50;
        }
        else if (newBalance >= 300){
            minPayment = (newBalance * 0.2);
        }
        NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Previous Balance:           " + money.format(previousBalance));
           System.out.println("Additional Charges: " + money.format(charges));
           System.out.println("Your New Balance:          " + money.format(newBalance));
           System.out.println("Minimum Payment Due: " + money.format(minPayment));
           System.out.println();
    }
}
