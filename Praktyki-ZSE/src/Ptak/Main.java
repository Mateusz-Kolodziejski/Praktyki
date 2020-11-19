package Ptak;

public class Main
{
    public static void main(String[] args)
    {
        Ptak Wrobel = new Ptak("Wrobel",21,0.040,"bialo-brazowy",true,"roslinozerny");
        Ptak Orzel = new Ptak("Bielik amerykanski",2.3,6.3,"brazowo-bialy",true,"miesozerny");
        Ptak Pingwin = new Ptak("Pingwin cesarski",0,45,"czarno-biały",false,"mięsożerny");

        System.out.println("Ptak 1 to: "+Wrobel.nazwa+ " o wadze "+Wrobel.waga+ " i kolorze "+Wrobel.kolor);
        System.out.println("Ptak 2 to: "+Orzel.nazwa+ " o wadze "+Orzel.waga+ " i kolorze "+Orzel.kolor);
        System.out.println("Ptak 3 to: "+Pingwin.nazwa+ " o wadze "+Pingwin.waga+ " i kolorze "+Pingwin.kolor);

    }
}
