package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

public abstract class Figure {
    private Color color = getRandomColor();

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract void draw();
}

