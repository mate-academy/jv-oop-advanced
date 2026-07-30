package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        FigureColor[] colors = FigureColor.values();
        int colorIndex = random.nextInt(colors.length);
        return colors[colorIndex].name().toLowerCase(Locale.ROOT);
    }
}
