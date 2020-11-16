import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w Retard Dungeon!");
        System.out.println("Twoim zadaniem będzie walka z przeciwnikami oraz ulepszanie swojego bohatera");
        System.out.println("Wpisz imię swojej postaci: ");
        var player = new Player(scanner.nextLine());
        System.out.println(player.getName() + " czas rozpocząć twoją przygodę!");
        Thread.sleep(2000);
        System.out.println("\n Próbujesz dotrzeć do miasteczka jednak aby tego dokonać musisz pokonać stojących na twojej drodze przeciwników");
        Menu menu = new Menu(scanner);
        menu.game_menu();

    }

}
