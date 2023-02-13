package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.*;

public abstract class Figure implements Drawable, Areable {
    String name;
    Color color;
    public static final int FIGURES_NUMBER = 5;


    Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public abstract double getArea();
    public abstract void draw();
}
