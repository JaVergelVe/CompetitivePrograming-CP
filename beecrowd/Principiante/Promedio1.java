
package beecrowd.Principiante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Promedio1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("#0.00000");
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        
        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
        
        System.out.println("MEDIA = " + decimales.format(MEDIA));

    }
}
