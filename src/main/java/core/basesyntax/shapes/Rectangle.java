package core.basesyntax.shapes;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.2f sq. units, "
                        + "width: %.2f units, "
                        + "height: %.2f units, "
                        + "color: %s\n",
                this.getClass().getSimpleName().toLowerCase(),
                getArea(),
                width,
                height,
                getColor().name());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
