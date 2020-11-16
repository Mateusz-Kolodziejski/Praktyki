import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Witaj w Retard Dungeon! \nTwoim zadaniem będzie walka z przeciwnikami oraz ulepszanie swojego bohatera");
        System.out.println("Wpisz imię swojej postaci :");
        Player.name = scan.nextLine();
        System.out.println("A więc, "+Player.name+" czas rozpocząć twoją przygodę!");
        Thread.sleep(2000);
        System.out.println("\n Próbujesz dotrzeć do miasteczka jednak aby tego dokonać musisz pokonać stojących na twojej drodze przeciwników");

        Menu menu;
        menu = new Menu();
        menu.game_menu();

    }

}
