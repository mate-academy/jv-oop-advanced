package core.basesyntax.figure;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(FigureType.SQUARE, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, "
                        + "area: %.1f sq. units, "
                        + "side: %d units, "
                        + "color: %s",
                getType().name().toLowerCase(),
                getArea(),
                side,
                getColor().name().toLowerCase()
        ));
    }
}
