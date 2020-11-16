import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = Objects.requireNonNull(scanner);
    }

    public void game_menu() {
        System.out.println("Witaj w miasteczku! Co chciałbyś zrobić?");
        System.out.println("\t 1) Wejdź do dungeonu 1 poziomu");
        System.out.println("\t 2) Odwiedź sklep");
        System.out.println("\t 3) Bitwa");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                System.out.println("Schodzisz po schodach w głąb ciemnego korytarza");
            case "2":
                System.out.println("Witaj w Retard Shop!");
            case "3":
                var battle = new Battle(createRandomEnemy());
            default:
                game_menu();
        }
    }

    private Enemy createRandomEnemy() {
        return new Enemy("jaca",
                ThreadLocalRandom.current().nextInt(1, 100),
                ThreadLocalRandom.current().nextInt(1, 100));
    }
}
