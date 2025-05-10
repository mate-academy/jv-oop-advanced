package core.figureclasses;

import core.interfaces.AreaCalculator;
import core.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String name;
    protected String color;

    public Figure(String name, String color) {
        this.color = color;
        this.name = name;
    }
}
