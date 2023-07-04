package core.basesyntax.figure;

import core.basesyntax.Color;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle{area: " + getArea() + " square units, "
                + "first leg = " + firstLeg + ", second leg = " + secondLeg
                + ", color = " + getColor() + '}');
    }
}
