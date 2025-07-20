package core.basesyntax.shapes;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class Square extends Figure {

    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.2f sq. units, "
                        + "side: %.2f units, "
                        + "color: %s\n",
                this.getClass().getSimpleName().toLowerCase(),
                getArea(),
                side,
                getColor().name());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
