package core.basesyntax;

import java.awt.*;

public abstract class Figure {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
