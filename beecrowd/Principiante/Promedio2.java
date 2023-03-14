
package beecrowd.Principiante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Promedio2 {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("#0.0");
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        
        double MEDIA = (A*2 + B*3 + C*5)/10;
        
        System.out.println("MEDIA = " + decimales.format(MEDIA));
        
    }
}
