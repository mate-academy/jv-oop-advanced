package core.basesyntax.figures;

import core.basesyntax.enums.Color;
import core.basesyntax.suppliers.ColorSupplier;

public abstract class Figure {
    ColorSupplier colorSupplier = new ColorSupplier();
    private Color color = colorSupplier.getRandomColor();

    public Color getColor() {
        return color;
    }
}
