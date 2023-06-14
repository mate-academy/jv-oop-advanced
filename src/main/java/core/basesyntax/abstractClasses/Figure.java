package core.basesyntax.abstractClasses;

import core.basesyntax.colorSupply.ColorSupplier;
import core.basesyntax.interfaces.AreaDefinition;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaDefinition {
    private String color;

    public String getColor() {
        final ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }
}
