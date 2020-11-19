package Zadania1;

import java.util.Scanner;

 class Uczen
{
    String imie;
    String nazwisko;
    int wiek;
}

class Info
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Uczen uczen = new Uczen();
        String button = "";

        do {
            System.out.println("DANE UCZNIA 1:");
            System.out.println("Jak masz na imię?");
            uczen.imie = scan.nextLine();
            System.out.println("Podaj swoje nazwisko:");
            uczen.nazwisko = scan.nextLine();
            System.out.println("Podaj swój wiek: ");
            uczen.wiek = Integer.parseInt(scan.nextLine());

            Uczen uczen2 = new Uczen();

            System.out.println("DANE UCZNIA 2:");
            System.out.println("Jak masz na imię?");
            uczen2.imie = scan.nextLine();
            System.out.println("Podaj swoje nazwisko:");
            uczen2.nazwisko = scan.nextLine();
            System.out.println("Podaj swój wiek: ");
            uczen2.wiek = Integer.parseInt(scan.nextLine());

            Uczen uczen3 = new Uczen();

            System.out.println("DANE UCZNIA 3:");
            System.out.println("Jak masz na imię?");
            uczen3.imie = scan.nextLine();
            System.out.println("Podaj swoje nazwisko:");
            uczen3.nazwisko = scan.nextLine();
            System.out.println("Podaj swój wiek: ");
            uczen3.wiek = Integer.parseInt(scan.nextLine());


            System.out.println("Dane uczniów:");
            System.out.println(uczen.imie + "\n" + uczen.nazwisko + "\n" + uczen.wiek + " lat" + "\n");
            System.out.println(uczen2.imie + "\n" + uczen2.nazwisko + "\n" + uczen2.wiek + " lat" + "\n");
            System.out.println(uczen3.imie + "\n" + uczen3.nazwisko + "\n" + uczen3.wiek + " lat" + "\n");

            System.out.println("Czy chcesz coś poprawić? Y/N");
            button = scan.nextLine();
        }while(button.equalsIgnoreCase("Y"));
    }
}
