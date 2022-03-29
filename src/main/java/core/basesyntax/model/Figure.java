package core.basesyntax.model;

import core.basesyntax.supplier.ColorSupplier;

public abstract class Figure implements Area, Draw {
    private String color;

    public Figure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public String getColor() {
        return color;
    }
}
