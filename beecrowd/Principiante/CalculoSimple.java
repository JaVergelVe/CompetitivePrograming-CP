
package beecrowd.Principiante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimple {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.00");
        
        int code1 = input.nextInt();
        int unit1 = input.nextInt();
        double precio1 = input.nextDouble();
        
        int code2 = input.nextInt();
        int unit2 = input.nextInt();
        double precio2 = input.nextDouble();
        
        double total = (unit1 * precio1) + (unit2 * precio2);
        
        System.out.println("VALOR A PAGAR: R$ " + decimal.format(total));
        
    }
}
