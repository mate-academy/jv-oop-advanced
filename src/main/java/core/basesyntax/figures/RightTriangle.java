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
        System.out.println("Figure: triangle, area: " + getArea() + " sq.units,"
                + " firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + "units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
    }
}
