package beecrowd.Principiante;

import java.util.Scanner;

public class ConversionDeTiempo {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int Tiempo = input.nextInt();
        
        int Horas = Tiempo/3600;
        int Minutos = (Tiempo-(Horas*3600))/60;
        int Segundos = Tiempo%60;
        
        System.out.println(Horas + ":" + Minutos + ":" + Segundos);
        
    }
}
