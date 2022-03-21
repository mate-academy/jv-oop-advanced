package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + ", first leg: " + firstLeg
                + ", second leg: " + secondLeg
                + ", color: " + getColor());
    }
}
