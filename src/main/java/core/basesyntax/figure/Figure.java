package core.basesyntax.figure;

import core.basesyntax.color.Color;

public abstract class Figure implements DrawableFigure, GeometricFigure {
    protected String color = "blank";

    public String getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color.name().toLowerCase();
    }

    public void setColor(String color) {
        this.color = color;
    }
}
