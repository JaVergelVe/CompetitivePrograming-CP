package beecrowd.Principiante;

import java.util.Scanner;

public class EdadEnDias {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int Edad = input.nextInt();
        
        int Anos = Edad/365;
        int Meses = (Edad%365)/30;
        int Dias = (Edad%30)/2;
        
        System.out.println(Anos + " ano(s)");
        System.out.println(Meses + " mes(es)");
        System.out.println(Dias + " dia(s)");
        
    }
}
