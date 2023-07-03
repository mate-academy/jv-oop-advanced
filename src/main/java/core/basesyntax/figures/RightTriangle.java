package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class RightTriangle extends Figure {
    private static final double CALCULATION_COEFFICIENT = 0.5;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return CALCULATION_COEFFICIENT * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor().name());
    }
}
