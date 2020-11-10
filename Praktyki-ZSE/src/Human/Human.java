package Human;

public class Human {
    protected double wzrost;
    protected char plec; // M - Mężczyzna // K - Kobieta
    protected double rozmiar_buta;
    protected boolean czy_lysy = false;
    protected String kolor_wlosow;
    protected int wiek;


    void setKolor_wlosow(String color){
        if(!czy_lysy){
            this.kolor_wlosow = color;
        }
        else{
            System.out.println("przeciez jest łysy, lol");
        }
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

    public double getWzrost() {
        return wzrost;
    }

    public char getPlec() {
        return plec;
    }

    public double getRozmiar_buta() {
        return rozmiar_buta;
    }

    public boolean isCzy_lysy() {
        return czy_lysy;
    }

    public String getKolor_wlosow() {
        return kolor_wlosow;
    }

    public int getWiek() {
        return wiek;
    }


    public Human(double wzrost, char plec, double rozmiar_buta, boolean czy_lysy, String kolor_wlosow, int wiek) {
        this.wzrost = wzrost;
        this.plec = plec;
        this.rozmiar_buta = rozmiar_buta;
        this.czy_lysy = czy_lysy;
        this.kolor_wlosow = kolor_wlosow;
        this.wiek = wiek;
    }
}