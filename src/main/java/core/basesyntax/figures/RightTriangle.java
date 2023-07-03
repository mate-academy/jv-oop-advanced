package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right rectangle\nColor: " + getColor()
                + "\nArea: " + this.calculateArea()
                + "\nFirst leg: " + firstLeg
                + "\nSecond leg: " + secondLeg);
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
