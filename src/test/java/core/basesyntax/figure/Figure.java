package core.basesyntax.figure;

import core.basesyntax.figure.interfaces.AreaCalculator;
import core.basesyntax.figure.interfaces.FigureDrawer;

public abstract class Figure implements AreaCalculator, FigureDrawer {
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
