package core.basesyntax.shapes;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.2f sq. units, "
                        + "base1: %.2f units, "
                        + "base2: %.2f units, "
                        + "height: %.2f units, "
                        + "color: %s\n",
                this.getClass().getSimpleName().toLowerCase(),
                getArea(),
                base1,
                base2,
                height,
                getColor().name());
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }
}
