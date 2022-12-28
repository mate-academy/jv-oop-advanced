package core.basesyntax.figure;

import core.basesyntax.color.Color;

public abstract class Figure implements DrawableFigure, GeometricFigure {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
