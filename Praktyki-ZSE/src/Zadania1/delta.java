package Zadania1;

import java.util.Scanner;
import static java.lang.Math.*;

public class delta
{
    public static void main(String[] args) {
        System.out.println("Program obliczy wyróżnik trójmianu kwadratowego oraz wyszuka wszystkie rozwiązania");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę (a): ");
        int a = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę (b): ");
        int b = scanner.nextInt();
        System.out.println("Wprowadź trzecią liczbę (c): ");
        int c = scanner.nextInt();

        int d = b * b - 4 * a * c;

        System.out.println("Delta z podanych liczb wynosi: " + d);

        if (d < 0)
        {
            System.out.println("Delta jest mniejsza od 0, więc nie mamy rozwiązań rzeczywistych");
        }
        else
        if (d == 0) {
            int xo = -b / 2 * a;
            System.out.println("Delta wynosi 0, mamy więc jedno rozwiązanie równe: xo = " + xo);
        }
        else {
            if (d > 0) {
                double x1 = (-b - sqrt(d)) / 2 * a;
                double x2 = (-b + sqrt(d)) / 2 * a;
                System.out.println("Delta jest większa od 0, więc mamy dwa rozwiązania równe kolejno: x1 =" + x1 + " oraz x2 =" + x2);
            }
        }


    }
}
