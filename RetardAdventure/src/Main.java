import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001B[01;93mWitaj w Retard Adventure!\u001B[00;00m \n");
        System.out.println("Na początku zalecamy zwiększyć rozmiar okna aby na pewno wszystko było dobrze widoczne!");
        Thread.sleep(3000);
        System.out.println("Wprowadź nazwę swojego bohatera");
        Player player = new Player("Gracz",100,20,0,1);
        player.setName(scanner.nextLine());
        System.out.println("A więc "+player.getName()+ " tak? Hmm, zabawne imię. No ale mniejsza o to.");
        Thread.sleep(2000);
        System.out.println("\u001B[01;30mNo dobra, niech zacznie się twoja przygoda!\u001B[00;00m \n");
        Thread.sleep(1000);
        System.out.println("O to twoje statystki, będą się one zwiększać wraz z postępem w grze \n");
        Thread.sleep(3000);
        System.out.println("\u001B[01;36m---------------STATYSTKI-------------\u001B[00;00m");
        System.out.println("Nazwa gracza : "+player.getName());
        System.out.println("Poziom gracza : "+player.getLvl());
        System.out.println("Punkty zdrowia :"+player.getHp());
        System.out.println("Punkty ataku: "+player.getDmg());
        System.out.println("XP: "+player.getXp());
        System.out.println("\u001B[01;36mX-----------------X-----------------X\u001B[00;00m \n");
        Thread.sleep(3000);
        System.out.println("\u001B[01;31mROZDZIAŁ PIERWSZY\u001B[00;00m \n");
        System.out.println("Podróż rozpoczynasz w swojej rodzinnej wiosce. Za oknem pada deszcz, oraz panuje mrok.");
        System.out.println("Wiesz jednak, że każda minuta się liczy. Ktoś lub coś porwało twojego brata a ty planujesz go odnaleźć");
        System.out.println("\u001B[01;30m(Cel główny : Odnajdź brata)\u001B[00;00m \n");
        Thread.sleep(3000);
        System.out.println("Pogoda Ci nie sprzyja, jednak zdecyduj : Czekać do rana czy wyruszyć teraz?");
        System.out.println("1) Wyrusz w dzień");
        System.out.println("2) Wyrusz teraz");
        String input = scanner.nextLine();

        switch (input)
        {
            case "1":
                System.out.println("Całą noc nie zmrużyłeś oka.");
                Thread.sleep(2000);
                System.out.println("Pogoda się uspokoiła i nastał dzień.");
                Thread.sleep(4000);
                System.out.println("Wchodzisz do lasu. Las jest wielki ale dzięki temu, iż wyruszyłeś w dzień widzisz mniej więcej jakie zagrożenia mogą na ciebie tutaj czekać.");
                Enemy borsuk = new Enemy("Agresywny borsuk",50,10,2);
                Thread.sleep(4000);
                System.out.println("Wszystko wydaje się być w porządku aż nagle! Wyskakuje na ciebie "+borsuk.getName());
                System.out.println("Co zrobisz?");
                while (borsuk.getHp() > 0) {

                    System.out.println("Twoje zdrowie: "+player.getHp());
                    System.out.println("Zdrowie przeciwnika: "+borsuk.getHp());
                    System.out.println("\u001B[01;31m1) Zaatakuj!\u001B[00;00m");
                    System.out.println("\u001B[01;37m2) Spróbuj uciekać!\u001B[00;00m \n");
                    String input2 = scanner.nextLine();
                    switch (input2) {

                        case "1":
                            System.out.println("Wymierzasz cios ze swojego zardzewiałego scyzoryka");
                            System.out.println("Zadałeś przeciwnikowi : " + player.getDmg() + " obrażeń");
                            System.out.println("Przeciwnik zadał ci: " + borsuk.getDmg() + " obrażeń");
                            borsuk.setHp(borsuk.getHp() - player.getDmg());
                            player.setHp(player.getHp() - borsuk.getDmg());
                            break;
                        case "2":
                            System.out.println("W zasadzie sam się dziwisz. Dlaczego uciekam od głupiego borsuka?");
                            Thread.sleep(2000);
                            System.out.println("Jednak w czasie tego przemyślenia potknąłeś się o korzeń drzewa.");
                            Thread.sleep(2000);
                            System.out.println("Tracisz przytomność!");
                            Thread.sleep(500);
                            System.out.println("Po ocknięciu się docierasz do wniosku : Jeśli nie mogę pokonać głupiego borsuka, to na pewno nie uratuję brata!");
                            Thread.sleep(2000);
                            System.out.println("Walczysz dalej!");
                            break;
                    }
                }
                break;

            case "2":
                System.out.println("Przemoknięty i zdezorientowany, wyruszasz w nocy.");
                Thread.sleep(2000);
                System.out.println("Idziesz przez las. Wielki i ciemny las. Nie jesteś w stanie dostrzec praktycznie niczego na swojej drodze.");
                Thread.sleep(3000);
                System.out.println("Czujesz doskonale czyjś oddech na swoich plecach.");
                Enemy mroczna_zjawa = new Enemy("Mroczna zjawa",80,10,3);
                System.out.println("Odwracasz się. Ku twoim oczom ukazuje się przerażająca, "+mroczna_zjawa.getName());
                System.out.println("Co zrobisz?");
                while (mroczna_zjawa.getHp() > 0) {
                    System.out.println("Twoje zdrowie: " + player.getHp());
                    System.out.println("Zdrowie przeciwnika :" + mroczna_zjawa.getHp() + "\n");
                    System.out.println("\u001B[01;31m1) Zaatakuj!\u001B[00;00m");
                    System.out.println("\u001B[01;37m2) Spróbuj uciekać!\u001B[00;00m \n");
                    String input2 = scanner.nextLine();
                    switch (input2) {
                        case "1":
                            System.out.println("Wymierzasz cios ze swojego zardzewiałego scyzoryka");
                            System.out.println("Zadałeś przeciwnikowi : " + player.getDmg() + " obrażeń");
                            System.out.println("Przeciwnik zadał ci: " + mroczna_zjawa.getDmg() + " obrażeń");
                            mroczna_zjawa.setHp(mroczna_zjawa.getHp() - player.getDmg());
                            player.setHp(player.getHp() - mroczna_zjawa.getDmg());

                            break;
                        case "2":
                            System.out.println("Odwracasz się od przeciwnika i biegniesz przed siebie");
                            Random random = new Random();
                            int getaway;
                            getaway = random.nextInt(100);
                            if (getaway >= 40) {
                                System.out.println("Cudem ,ale udało Ci się uciec od tej mrocznej Zjawy!");
                                Thread.sleep(2000);
                                System.out.println("Biegniesz dalej aż napotykasz... Tą samą zjawę!");
                                Thread.sleep(2000);
                                System.out.println("Dochodzisz do wniosku że przed nią nie ma ucieczki");
                                System.out.println("Zbierasz resztki sił i biegniesz ku swojemu prześladowcy (+20 HP)");
                                player.setHp(player.getHp() + 20);

                            } else {
                                System.out.println("Potknąłeś się o korzeń drzewa, Zjawa cię dopadła! To koniec!");
                                System.out.println("\u001B[01;31m(Cel główny : Odnajdź brata - NIEZALICZONY!)\u001B[00;00m \n");
                                Thread.sleep(2000);
                                System.exit(0);
                            }
                    }

                    if (player.getHp() <= 0) {
                        System.out.println("Zostałeś zgładzony przez Mroczną zjawę to koniec twojej wędrówki!");
                        System.out.println("\u001B[01;31m(Cel główny : Odnajdź brata - NIEZALICZONY!)\u001B[00;00m \n");
                        System.exit(0);
                    } else if (mroczna_zjawa.getHp() <= 0) {

                        System.out.println("Udało Ci się pokonać zjawę!");
                        System.out.println("Biegiem wychodzisz z tego przeklętego lasu.");
                        System.out.println("W myślach masz tylko jedno. Co mogło spotkać twojego brata jeżeli ciebie atakują zjawy w lesie!");
                        break;
                    }
                }
        }
        System.out.println("\n Po nie przespanej nocy rozbijasz obóz i zasypiasz jak dziecko.");
        System.out.println("\u001B[01;31mROZDZIAŁ DRUGI\u001B[00;00m \n");
        Thread.sleep(2000);
        System.out.println("Zwijasz obóz i wyruszasz w dalszą drogę.");
        System.out.println("Spotykasz starego dziadka na środku drogi.");




    }


}

