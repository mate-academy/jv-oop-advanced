package core.basesyntax.suppliers;

import core.basesyntax.enums.FigureColor;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int randomIndex = random.nextInt(FigureColor.values().length);

    public String getRandomColor() {
        return FigureColor.values()[randomIndex].name();
    }
}
