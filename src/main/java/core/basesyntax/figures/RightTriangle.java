package core.basesyntax.figures;

import core.basesyntax.figures.AreaCalculator;
import core.basesyntax.figures.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("First leg: %s,Second leg: %s",
                firstLeg, secondLeg));
    }
}
