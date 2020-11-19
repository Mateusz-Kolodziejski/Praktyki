import java.util.Objects;
import java.util.Random;

public class Battle {
    private final Enemy enemy;

    public Battle(Enemy enemy) {
        this.enemy = Objects.requireNonNull(enemy);
    }

    public void tick() {

    }
}
