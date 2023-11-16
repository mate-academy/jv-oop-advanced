package core.basesyntax.figures;

import core.basesyntax.utils.AreaCalculator;
import core.basesyntax.utils.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
