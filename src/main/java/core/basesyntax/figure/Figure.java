package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.constants.Messages;

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
        if (color == null) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color.name().toLowerCase();
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException(Messages.ILLEGAL_FIGURE_COLOR);
        }

        this.color = color;
    }
}
