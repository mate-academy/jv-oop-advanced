package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RIGHT TRIANGLE, area: "
                + getArea()
                + " sq.units, "
                + "first leg: "
                + firstLeg
                + " units,"
                + " second leg: "
                + secondLeg
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
