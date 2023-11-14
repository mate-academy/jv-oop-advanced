package core.basesyntax.figures;

import core.basesyntax.utiles.ColorSupplier;

public abstract class Figure implements AreaCalculator, InformFigurePrinter {
    private String color;

    public String getColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    public void setColor(String color) {
        this.color = color;
    }
}
