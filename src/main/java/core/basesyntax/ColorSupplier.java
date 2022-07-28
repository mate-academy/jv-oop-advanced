package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public FigureColor getRandomColor() {
        int number = random.nextInt(FigureColor.values().length);
        return FigureColor.values()[number];
    }
}
