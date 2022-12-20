package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double square() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        String square = String.format("%.1f", square());
        System.out.println("Figure: rightTriangle, area: " + square + " sq.units, firstLeg: " + firstLeg + ", units, "
                + "secondLeg: " + secondLeg + ", units, color: " + super.getColor());
    }
}
