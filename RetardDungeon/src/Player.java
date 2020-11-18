public class Player
{
    String name;
    int player_hp;
    int player_damage;
    int player_xp;
    int player_lvl;
    int player_money;

    public Player(String name, int player_hp, int player_damage, int player_xp, int player_lvl, int player_money)
    {
        this.name = name;
        this.player_hp = player_hp;
        this.player_damage = player_damage;
        this.player_xp = player_xp;
        this.player_lvl = player_lvl;
        this.player_money = player_money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayer_hp() {
        return player_hp;
    }

    public void setPlayer_hp(int player_hp) {
        this.player_hp = player_hp;
    }

    public int getPlayer_damage() {
        return player_damage;
    }

    public void setPlayer_damage(int player_damage) {
        this.player_damage = player_damage;
    }

    public int getPlayer_xp() {
        return player_xp;
    }

    public void setPlayer_xp(int player_xp) {
        this.player_xp = player_xp;
    }

    public int getPlayer_lvl() {
        return player_lvl;
    }

    public void setPlayer_lvl(int player_lvl) {
        this.player_lvl = player_lvl;
    }

    public int getPlayer_money() {
        return player_money;
    }

    public void setPlayer_money(int player_money) {
        this.player_money = player_money;
    }

