package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        final int index = random.nextInt(FigureColor.values().length);
        return FigureColor.values()[index].name();
    }
}
