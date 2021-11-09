package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.figureType = FigureType.RECTANGLE.toString().toLowerCase(Locale.ROOT);
    }

    @Override
    public double getArea() {
        return sideB * sideA;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.0f sq.units,"
                        + " firstSide: %d units,"
                        + " secondSide: %d units,"
                        + " color: %s%n",
                figureType,
                getArea(),
                sideA,
                sideB,
                color);
    }
}
