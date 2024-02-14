package core.basesyntax.figure;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(Color color,
                              int firstSide,
                              int secondSide,
                              int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;

    }

    @Override
    public void draw() {
        System.out.println("First Side: " + firstSide + ", Second Side: " + secondSide
                + ", Parallel Side: " + height);
        super.draw();
    }

    @Override
    public double getArea() {
        return ((firstSide + secondSide) * height) / 2;
    }
}
