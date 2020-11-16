import java.util.Scanner;

public class Menu
{
   public void game_menu()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Witaj w miasteczku! Co chciałbyś zrobić?");
        System.out.println("\t 1) Wejdź do dungeonu 1 poziomu \n \t 2) Odwiedź sklep");
        String input = scan.nextLine();

        switch (input)
        {
            case "1" ->
                    {
                        System.out.println("Schodzisz po schodach w głąb ciemnego korytarza");

                    }
            case "2" -> System.out.println("Witaj w Retard Shop!");
        }
    }





}
