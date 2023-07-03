package beecrowd.Principiante;
import java.util.Scanner;
public class BilletesYMonedas {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        double N = input.nextDouble();
        
        double Billetes = N/100;
        
        System.out.println("NOTAS:");
        System.out.println(Billetes + " nota(s) de R$ 100,00");
        N -= Billetes*100;
        Billetes = N/50;
        System.out.println(Billetes + " nota(s) de R$ 50,00");
        N -= Billetes*50;
        Billetes = N/20;
        System.out.println(Billetes + " nota(s) de R$ 20,00");
        N -= Billetes*20;
        Billetes = N/10;
        System.out.println(Billetes + " nota(s) de R$ 10,00");
        N -= Billetes*10;
        Billetes = N/5;
        System.out.println(Billetes + " nota(s) de R$ 5,00");
        N -= Billetes*5;
        Billetes = N/2;
        System.out.println(Billetes + " nota(s) de R$ 2,00");
        
        System.out.println("MOEDAS:");
        N -= Billetes*2;
        Billetes = N;
        System.out.println(Billetes + " moeda(s) de R$ 1.00");
        N -= Billetes;
        System.out.println(N);
        
    }
}