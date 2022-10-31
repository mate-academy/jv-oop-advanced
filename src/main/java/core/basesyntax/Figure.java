package core.basesyntax;

import core.basesyntax.service.ColorSupplier;

public abstract class Figure implements CalculatorArea, Drawable {
    private String color = new ColorSupplier().getRandomColor();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

