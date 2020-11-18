import java.util.Scanner;

public class Main
{
    public void main(String[] args) throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zalecamy zwiększyć rozmiar okna konsoli, aby wszystko było dobrze widoczne!\n");
        Thread.sleep(4000);
        System.out.println("Witamy w Retard Dungeon!");
        Player player = new Player("Gracz",100,30,0,1,0);
        System.out.println("Jak będziesz się nazywał ?");
        player.setName(scanner.nextLine());
        System.out.println("A więc, "+ player.getName()+" czas rozpocząć twoją przygodę!");
        System.out.println("X------------------------------------------------------------X");
        System.out.println("O to twoje statystyki, będą się one zwiększać wraz z progresem w grze");
        System.out.println("Nazwa gracza : "+ player.getName());
        System.out.println("Punkty zdrowia : "+ player.getPlayer_hp());
        System.out.println("Punkty ataku : "+ player.getPlayer_damage());
        System.out.println("Poziom bohatera :"+ player.getPlayer_lvl());
        System.out.println("Posiadane Retard Coins: "+ player.getPlayer_money());
        Thread.sleep(4000);
        System.out.println("Gotowy zmierzyć się ze swoim pierwszym przeciwnikiem? \n");
        Thread.sleep(2000);
        System.out.println("BOOM!");
        Enemies.spawn_enemy();
        while (Enemies.enemy_hp > 0) {
            System.out.println("Twoje punkty zdrowia: " + player.getPlayer_hp());
            System.out.println("Zdrowie przeciwnika: "+Enemies.enemy_hp);
            System.out.println("Jaki będzie twój następny krok?: ");
            System.out.println("1) Atakuj!");
            System.out.println("2) Wypij miksturę zdrowia");
            String input = scanner.nextLine();

            switch(input)
            {
                case "1":
                {
                    Enemies.enemy_attack();
                    player.player_attack();
                    System.out.println("Przeciwnik zadał Ci: "+Enemies.enemy_damage);
                    System.out.println("Zadałeś przeciwnikowi: "+player.player_damage);
                    break;
                }
                case "2":
                {
                    System.out.println("Wypiłeś miksturę zdrowia!");
                    break;
                }
                default:
                    if (input.equals("Głupia gra")) {
                        System.out.println("Sam jesteś głupi! Koniec gry, do mycia!!!!");
                        System.exit(0);
                    } else
                        {
                        System.out.println("Nie ma takiego polecenia!");
                        break;
                        }
            }
            if (player.getPlayer_hp() <= 0)
            {
                System.out.println("Zostałeś pokonany! To koniec twojej przygody");
                System.exit(0);
            }
            else if (Enemies.enemy_hp <= 0)
            {
                System.out.println("Udało Ci się pokonać przeciwnika!");
                System.out.println("---------LOOT----------");
                System.out.println("Twoje nagrody to : ");
                System.out.println("+ Premia do punktów zdrowia");
                System.out.println("+ Sakwa przeciwnika (+10 Retard Coins)");
                System.out.println("+ Premia do punktów ataku");
            }
        }
    }
}
