package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    private static final String[] COLORS = {
            "white", "black", "red", "green", "blue", "yellow"
    };
    private final Random random = new Random();
    public String getRandomColor() {
        int idx = random.nextInt(COLORS.length);
        return COLORS[idx];
    }
}
