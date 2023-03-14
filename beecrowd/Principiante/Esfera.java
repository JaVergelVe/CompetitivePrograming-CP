
package beecrowd.Principiante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#0.000");
        
        double pi = 3.14159;
        int R = input.nextInt();
        
        double VOLUME = (4.0/3.0) * pi * Math.pow(R, 3);
        
        System.out.println("VOLUME = " + decimal.format(VOLUME));
        
    }
}
