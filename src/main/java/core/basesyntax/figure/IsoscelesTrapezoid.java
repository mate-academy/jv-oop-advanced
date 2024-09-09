package core.basesyntax.figure;

import base.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double side;
    private final double firstBase;
    private final double secondBase;

    public IsoscelesTrapezoid(String color, double side, double firstBase, double secondBase) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        return firstBase * side - secondBase * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " side: " + side
                + " firstBase " + firstBase
                + " secondBase " + secondBase
                + " color: " + color);
    }
}
