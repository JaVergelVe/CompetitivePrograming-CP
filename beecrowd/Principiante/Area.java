
package beecrowd.Principiante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.000");
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        
        double area = (A * C)/2;
        System.out.println("TRIANGULO: " + decimal.format(area));
        
        area = 3.14159 * Math.pow(C, 2);
        System.out.println("CIRCULO: " + decimal.format(area));
        
        area = ((A + B) * C)/2;
        System.out.println("TRAPEZIO: " + decimal.format(area));
        
        area = Math.pow(B, 2);
        System.out.println("QUADRADO: " + decimal.format(area));
        
        area = A * B;
        System.out.println("RETANGULO: " + decimal.format(area));
        
    }
}
