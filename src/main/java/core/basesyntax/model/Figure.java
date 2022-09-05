package core.basesyntax.model;

import core.basesyntax.ColorSupplier;

public abstract class Figure {
    private String color;

    public abstract double getArea();

    public void setRandomParameters() {
        this.color = ColorSupplier.getRandomColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
