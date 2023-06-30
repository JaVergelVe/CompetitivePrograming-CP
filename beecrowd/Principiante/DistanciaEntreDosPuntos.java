package beecrowd.Principiante;

import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntreDosPuntos {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("#0.0000");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double Distancia = sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(decimales.format(Distancia));

    }
}
