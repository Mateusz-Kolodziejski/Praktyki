public class Player
{
    private String name;
    private int hp;
    private int dmg;
    private int xp;
    private int lvl;

    public Player(String name, int hp, int dmg, int xp, int lvl) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.xp = xp;
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
