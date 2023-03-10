package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final FigureColor[] colors = FigureColor.values();
    private final Random random = new Random();

    public FigureColor getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
