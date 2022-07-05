package core.basesyntax.figures;

import core.basesyntax.service.supplier.AreaCalculator;
import core.basesyntax.service.supplier.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}