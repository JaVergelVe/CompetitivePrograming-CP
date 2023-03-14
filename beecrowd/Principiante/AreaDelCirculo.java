
package beecrowd.Principiante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaDelCirculo {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("#.0000");
        
        double pi = 3.14159;
        double radio = input.nextDouble();
        
        double area = pi * Math.pow(radio, 2);
        
        System.out.println("A=" + decimales.format(area));
        
    }
}
