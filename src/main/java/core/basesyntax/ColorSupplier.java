package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final FigureColor[] COLORS = FigureColor.values();
    private final Random random = new Random();

    public FigureColor getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
private static final Color[] COLORS = Color.values();
