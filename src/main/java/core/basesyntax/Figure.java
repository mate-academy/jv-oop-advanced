package core.basesyntax;

import core.basesyntax.supliers.ColorSupplier;

public abstract class Figure implements AreaMeasurable, Drawable {
    private String color = new ColorSupplier().getRandomColor();

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }
}

