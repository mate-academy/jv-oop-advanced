package core.basesyntax.service;

import core.basesyntax.supplier.ColorSupplier;

public abstract class Figure implements Drawable {
    protected ColorSupplier colorSupplier = new ColorSupplier();
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
