
package beecrowd.Principiante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.00");
        
        int     NUMBER  = input.nextInt();
        int     HOURS   = input.nextInt();
        double  PAY     = input.nextDouble();
        
        double SALARY = HOURS * PAY;
        
        System.out.println("NUMBER = " + NUMBER);
        System.out.println("SALARY = U$ " + decimal.format(SALARY));
        
    }
}
