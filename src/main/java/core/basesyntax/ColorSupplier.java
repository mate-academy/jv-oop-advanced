package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public FigureColors getRandomColor() {
        FigureColors[] figureColors = FigureColors.values();
        return figureColors[random.nextInt(figureColors.length - 1)];
    }
}
