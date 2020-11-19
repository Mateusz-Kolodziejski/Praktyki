import java.util.Random;

public class Enemies
{
    String name;
     int enemy_hp;
     int enemy_damage;


    public Enemies(String name, int enemy_hp, int enemy_damage) {
        this.name = name;
        this.enemy_hp = enemy_hp;
        this.enemy_damage = enemy_damage;
    }

    void spawn_enemy ()
    {
        Random rand = new Random();

        String[] enemy_name = {"Troll","Ork","Bandyta","Wilk","Zombie","Zjawa"};

        name = enemy_name[rand.nextInt(enemy_name.length)];

        enemy_hp = (int)(100 * Math.random());
        System.out.println("Na arenę wkracza : "+name);
    }

     void enemy_attack ()
    {
        enemy_damage = (int)(enemy_damage * Math.random());
        Player.setPlayer_hp(Player.getPlayer_hp() - enemy_damage);
    }
}
