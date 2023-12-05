package core.basesyntax.figures;

import core.basesyntax.interfaces.Area;
import core.basesyntax.interfaces.Draw;

public abstract class Figure implements Area, Draw {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();
}
