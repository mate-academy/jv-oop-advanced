package core.basesyntax;

import java.awt.*;

public abstract class Figure {
    private Color color;

    protected Figure(Color color) { //or public
        this.color = color;
    }

    public abstract double getArea();
    public abstract void draw();
}
