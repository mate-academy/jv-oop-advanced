package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String DEFAULT_COLOR = new ColorSupplier().getDefaultColor();
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[(random.nextInt(Color.values().length))].name();
    }

    public String getDefaultColor() {
        return Color.WHITE.toString();
    }
}
