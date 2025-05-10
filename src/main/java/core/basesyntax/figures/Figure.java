package core.basesyntax.figures;

import core.basesyntax.utils.AreaCalculator;
import core.basesyntax.utils.Drawable;

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
