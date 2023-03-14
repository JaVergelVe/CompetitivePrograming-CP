
package beecrowd.Principiante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioConBonus {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.00");
        
        String name = input.nextLine();
        double salary = input.nextDouble();
        double sold = input.nextDouble();
        
        double TOTAL = salary + sold * 0.15;
        
        System.out.println("TOTAL = R$ " + decimal.format(TOTAL));
        
    }
}
