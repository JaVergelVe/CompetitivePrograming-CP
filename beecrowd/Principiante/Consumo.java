package beecrowd.Principiante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("#0.000");

        int X = input.nextInt();
        double Y = input.nextDouble();

        double Consumo = X / Y;

        System.out.println(decimales.format(Consumo) + " km/l");

    }
}
