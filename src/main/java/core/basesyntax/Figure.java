package core.basesyntax;

import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
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
