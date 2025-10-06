package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    private final Random random = new Random();
    final int DEFAULT_COLOR = Color.values().length;
    public String getRandomColor() {
        Color color = Color.values()[random.nextInt(DEFAULT_COLOR)];
        return color.name();
    }
}