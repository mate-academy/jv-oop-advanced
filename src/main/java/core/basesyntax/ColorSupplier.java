package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[(random.nextInt(Color.values().length))].name();
    }
}
