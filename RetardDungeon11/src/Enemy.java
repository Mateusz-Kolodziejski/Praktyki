import java.util.Objects;

public class Enemy {
    private final String name;
    private final int hp;
    private final int dmg;

    public Enemy(String name, int hp, int dmg) {
        if (hp < 0) {
            throw new IllegalArgumentException("HP musi być dodatnie");
        } else if (dmg < 0) {
            throw new IllegalArgumentException("DMG musi być dodatnie");
        }
        this.name = Objects.requireNonNull(name);
        this.hp = hp;
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }
}
