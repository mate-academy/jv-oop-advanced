package core.basesyntax.figure;

import core.basesyntax.color.Color;

public abstract class Figure implements DrawableFigure, GeometricFigure {
    private static final String FIGURE_NAME = "figure";
    protected String color = "blank";

    public static String getName() {
        return FIGURE_NAME;
    }

    public String getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color.name().toLowerCase();
    }
}
