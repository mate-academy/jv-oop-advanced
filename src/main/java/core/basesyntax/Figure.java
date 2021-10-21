package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

public abstract class Figure implements GetArea, PrintInfo {
    private String shape;
    private String color = getRandomColor();

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

