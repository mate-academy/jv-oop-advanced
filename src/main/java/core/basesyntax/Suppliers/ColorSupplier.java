package core.basesyntax.Suppliers;

import core.basesyntax.EnumClass.ColorOfFigure;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int colorIndex = new Random().nextInt(ColorOfFigure.values().length);
        return String.valueOf(ColorOfFigure.values()[colorIndex]);
    }

    public String getDefaultColor() {
        return String.valueOf(ColorOfFigure.WHITE);
    }
}
