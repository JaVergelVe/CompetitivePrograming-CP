package beecrowd.Principiante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CombustibleGastado {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        DecimalFormat decimales = new DecimalFormat("#0.000");
        
        int Horas = input.nextInt();
        int Velocidad = input.nextInt();
        
        double Distancia = Velocidad*Horas;
        double Litros = Distancia/12;
        
        System.out.println(decimales.format(Litros));
        
    }
}
