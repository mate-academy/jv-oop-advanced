package core.basesyntax.figure;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(Color color, int length, int width) {
        super(FigureType.RECTANGLE, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, "
                        + "area: %.1f sq. units, "
                        + "length: %d units, width: %d units, "
                        + "color: %s",
                getType().name().toLowerCase(),
                getArea(),
                length, width,
                getColor().name().toLowerCase()
        ));
    }
}
