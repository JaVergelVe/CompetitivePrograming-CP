
package beecrowd.Principiante;

import java.util.Scanner;

public class Billetes {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        int Billetes = N/100;
        
        System.out.println(N);
        System.out.println(Billetes + " nota(s) de R$ 100,00");
        Billetes = (N%100)/50;
        System.out.println(N%100);
        System.out.println(Billetes + " nota(s) de R$ 50,00");
        Billetes = (N%50)/20;
        System.out.println(N%50);
        System.out.println(Billetes + " nota(s) de R$ 20,00");
        Billetes = (N%20)/10;
        System.out.println(N%20);
        System.out.println(Billetes + " nota(s) de R$ 10,00");
//        Billetes = (N%10)/5;
//        System.out.println(N%10);
//        System.out.println(Billetes + " nota(s) de R$ 5,00");
//        Billetes = (N%5)/2;
//        System.out.println(N%5);
//        System.out.println(Billetes + " nota(s) de R$ 2,00");
//        Billetes = N%2;
//        System.out.println(N%2);
//        System.out.println(Billetes + " nota(s) de R$ 1,00");
        
    }
}
