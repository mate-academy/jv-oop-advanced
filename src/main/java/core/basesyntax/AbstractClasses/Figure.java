package core.basesyntax.AbstractClasses;

import core.basesyntax.ColorSupply.ColorSupplier;
import core.basesyntax.Interfaces.AreaDefinition;
import core.basesyntax.Interfaces.Drawable;

public abstract class Figure implements Drawable, AreaDefinition {
    private String color;

    public String getColor() {
        final ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }
}
