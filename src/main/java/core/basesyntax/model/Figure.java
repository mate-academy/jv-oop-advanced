package core.basesyntax.model;

import core.basesyntax.behavior.AreaCalculator;
import core.basesyntax.behavior.Drawer;

public abstract class Figure implements AreaCalculator, Drawer {
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
