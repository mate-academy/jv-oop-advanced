package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final double firsLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firsLeg, double secondLeg) {
        super(color);
        this.firsLeg = firsLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle has firstLeg " + firsLeg
                + "secondLeg " + secondLeg + " and area" + getArea()
                + " units" + "color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return firsLeg * secondLeg / 2;
    }
}
