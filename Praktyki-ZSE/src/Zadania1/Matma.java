package Zadania1;
import java.util.Scanner;

public class Matma
{
    static double PI = 3.14;
    static double E  = 2.71;
}
class działania {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        {
            System.out.println("Wprowadź liczbę a:");
            int a = scan.nextInt();
            System.out.println("Wprowadź liczbę b:");
            int b = scan.nextInt();
            System.out.println("Wprowadź liczbę c:");
            int c = scan.nextInt();
            double potega3 = Math.pow(a,3);
            int suma = a+b;
            int roz = a-b;
            int ilo = a*b;
            System.out.println(a+ " do potęgi 3 to "+potega3);
            System.out.println("Suma liczb a i b to "+suma);
            System.out.println("Różnica liczb a i b to "+roz);
            System.out.println("Iloczyn liczb a i b to "+ilo);

            if(a*a+b*b==c*c)
            {
                System.out.println("Z tych odcinków zbudujemy trójkąt prostokątny :)");
            }
            else
            {
                System.out.println("Z tych odcinków nie zbudujemy trójkąta prostokątnego");
            }
        }
    }
}
// Zdaje sobie sprawę że to zadanie miało zupełnie inaczej wyglądać (XD) a przynajmniej tak mi się wydaje
// ale zrobiłem tak jak umiałem,jak na razie