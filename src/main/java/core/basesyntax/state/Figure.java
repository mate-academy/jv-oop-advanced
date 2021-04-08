package core.basesyntax.state;

import core.basesyntax.behavior.AreaCalculator;
import core.basesyntax.behavior.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
