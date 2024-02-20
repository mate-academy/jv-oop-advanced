package core.basesyntax.figures;

import core.basesyntax.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (0.5 * firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle; area: " + calculateArea()
                + " sq. units; first leg: " + firstLeg + " units; second leg: "
                + secondLeg + " units; color: " + getColor());
    }
}
