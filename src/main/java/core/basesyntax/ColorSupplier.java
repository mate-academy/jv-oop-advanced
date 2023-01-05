package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();

    public Color getRandomColor() {
        int randomInteger = random.nextInt(Color.values().length);
        return Color.values()[randomInteger];
    }
}
