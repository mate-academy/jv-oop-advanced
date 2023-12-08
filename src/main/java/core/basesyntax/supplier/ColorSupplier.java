package core.basesyntax.supplier;

import core.basesyntax.figure.FigureColor;
import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(FigureColor.values().length);
        return FigureColor.values()[randomColorIndex].name().toLowerCase();
    }
}
