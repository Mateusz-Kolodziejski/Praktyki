package Human;

    class Mechanic extends Human
    {
        String imie;
        String nazwisko;
        int lata_pracy;
        boolean czy_urlop;
        double pensja;

    public Mechanic(double wzrost, char plec, double rozmiar_buta, boolean czy_lysy, String kolor_wlosow, int wiek, int lata_pracy, boolean czy_urlop, String imie, String nazwisko, double pensja) {
        super( wzrost, plec, rozmiar_buta, czy_lysy, kolor_wlosow, wiek);
        this.lata_pracy = lata_pracy;
        this.czy_urlop = czy_urlop;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }
}