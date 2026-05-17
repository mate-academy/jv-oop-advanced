package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Print;

public class RightTriangle extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double secondLeg, double firstLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double calculateArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + calculateArea()
                + " sq. units, First Leg: " + firstLeg
                + " units, Second Leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
