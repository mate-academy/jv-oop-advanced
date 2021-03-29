package core.basesyntax.figures;

import core.basesyntax.state.ColorSupplier;
import core.basesyntax.state.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String name) {
        this.name = name;
        color = ColorSupplier.getRandomColor();
        radius = (int)((Math.random() * 10) + 1);
    }

    @Override
    public double area() {
        return Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, radius: %d cm, color: %s\n",
                name, area(), radius, color);
    }
}
