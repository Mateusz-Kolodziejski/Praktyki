package cwiczenie;

public class Main
{

    public static void main(String[] args)
    {
        Human Kamil = new Human();
        Human Kacper = new Human();
        Human Andrzej = new Human();

        Kamil.setCzy_lysy(false);
        Kamil.setColor_wlosow("blond");
        Kamil.setPlec('m');
        Kamil.setWzrost(170);

        Andrzej.setColor_wlosow("czarne");
        Andrzej.setPlec('m');
        Andrzej.setWiek(22);
        Andrzej.setRozmiar_buta(42.5);
        Human matka = new Human();
        Human ojciec = new Human();
       // Human brat = new Human();
       // Human listonosz = new Human();
       // Andrzej.rodzice =new Human[] {matka, ojciec, brat , listonosz};

        Andrzej.setRodzice(matka, ojciec);


    }
}
