package core.basesyntax;

import core.basesyntax.supliers.ColorSupplier;

public abstract class Figure implements AreaMeasurable, Drawable {
    private String color;

    public Figure() {
        color = new ColorSupplier().getRandomColor();
    }

    public Figure(String color, int maxVa) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

