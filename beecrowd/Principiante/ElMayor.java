package beecrowd.Principiante;

import static java.lang.Math.abs;
import java.util.Scanner;

public class ElMayor {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int MaiorAB = (a + b + abs(a - b)) / 2;
        int Maior = (MaiorAB + c + abs(MaiorAB - c)) / 2;

        System.out.println(Maior + " eh o maior");

    }
}
