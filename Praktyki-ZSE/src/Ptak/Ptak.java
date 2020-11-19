package Ptak;

public class Ptak
{
    String nazwa;
    double rozpietosc_skrzydel;
    double waga;
    String kolor;
    Boolean czy_lata = true;
    String sposob_zywienia;

    Ptak(String nazwa,double rozpietosc_skrzydel,double waga, String kolor, Boolean czy_lata, String sposob_zywienia)
    {
        this.nazwa = nazwa;
        this.rozpietosc_skrzydel = rozpietosc_skrzydel;
        this.waga = waga;
        this.kolor = kolor;
        this.czy_lata = czy_lata;
        this.sposob_zywienia = sposob_zywienia;
    }
}
