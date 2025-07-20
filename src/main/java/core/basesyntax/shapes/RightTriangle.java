package core.basesyntax.shapes;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class RightTriangle extends Figure {

    private final double base;
    private final double height;

    public RightTriangle(Color color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.2f sq. units, "
                        + "base: %.2f units, "
                        + "height: %.2f units, "
                        + "color: %s\n",
                this.getClass().getSimpleName().toLowerCase(),
                getArea(),
                base,
                height,
                getColor().name());
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
