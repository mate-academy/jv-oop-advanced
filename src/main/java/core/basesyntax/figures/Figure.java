package core.basesyntax.figures;

import core.basesyntax.behavior.AreaCalculator;
import core.basesyntax.behavior.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    protected String color;

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
