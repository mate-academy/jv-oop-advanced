package core.basesyntax;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
