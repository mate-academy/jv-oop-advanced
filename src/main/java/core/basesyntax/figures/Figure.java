package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

public abstract class Figure implements FigureEvaluation, isDrawable {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private String color;

    {
        this.color = colorSupplier.getRandomColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
