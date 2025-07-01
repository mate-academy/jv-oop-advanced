package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.logic.Figure;

public class Rectangle extends Figure {

    private final double firstSide;
    private final double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq. units, length: "
                + firstSide
                + " units, width: "
                + secondSide + " units, color: "
                + getColor());
    }
}
