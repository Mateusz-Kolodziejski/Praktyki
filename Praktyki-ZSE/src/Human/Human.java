package Human;

public class Human {

    private double wzrost;
    private char plec;
    private double rozmiar_buta;
    private boolean czy_lysy = false;
    private String color_wlosow;
    private int wiek;
    private Human[] rodzice;


    static String gatunek = "homo sapiens";
    static String królestwo = "ssaki";
    static long liczba_ludzi_na_ziemii = 780000000l;


    void setColor_wlosow(String color) {
        if (!czy_lysy) {
            this.color_wlosow = color;
        } else {
            System.out.println("Osoba jest łysa!");
        }
    }

    public void setRodzice(Human matka, Human ojciec) {
        rodzice = new Human[]{matka, ojciec};
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void setRozmiar_buta(double rozmiar_buta) {
        this.rozmiar_buta = rozmiar_buta;
    }

    public void setCzy_lysy(boolean czy_lysy) {
        this.czy_lysy = czy_lysy;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}

