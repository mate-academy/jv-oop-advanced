package core.basesyntax.figures;

import core.basesyntax.state.ColorSupplier;
import core.basesyntax.state.Figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String name) {
        this.name = name;
        color = ColorSupplier.getRandomColor();
        length = (int)((Math.random() * 10) + 1);
        width = (int)((Math.random() * 10) + 1);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, length: %d cm, width: %d cm, "
                + "color: %s\n", name, area(), length, width, color);
    }
}
