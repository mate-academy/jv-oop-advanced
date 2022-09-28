package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(Color color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide
                + " units, height: " + height
                + " units, color: " + getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return height * ((firstSide + secondSide) / 2);
    }
}
