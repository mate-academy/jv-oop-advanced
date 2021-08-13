package core.figureClasses;

import core.interfaces.AreaCalculator;
import core.interfaces.Draw;

public abstract class Figure implements AreaCalculator, Draw {
    protected String name;
    protected String color;

    public Figure (String name, String color) {
        this.color = color;
        this.name = name;
    }
}
