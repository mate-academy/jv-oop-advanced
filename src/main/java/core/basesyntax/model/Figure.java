package core.basesyntax.model;

import core.basesyntax.ColorSupplier;

public abstract class Figure implements FiguresBehaviour {
    private String color;

    public void setRandomParameters() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
