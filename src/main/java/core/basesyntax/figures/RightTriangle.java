package core.basesyntax.figures;

import core.basesyntax.abstractions.Figure;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure "
                        + "right triangle"
                        + ", area:"
                        + calculateArea()
                        + ", firs leg = "
                        + firstLeg
                        + ", second leg = "
                        + secondLeg
                        + ", color: " + super.getColor());
    }

}
