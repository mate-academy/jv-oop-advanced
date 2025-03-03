package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
        super();
        Random random = new Random();
        this.firstLeg = Math.round(random.nextDouble(100) * 10.0) / 10.0;
        this.secondLeg = Math.round(random.nextDouble(100) * 10.0) / 10.0;
    }

    public RightTriangle(double firstLeg, double secondLeg) {
        super();
        this.firstLeg = Math.round(firstLeg * 10.0) / 10.0;
        this.secondLeg = Math.round(secondLeg * 10.0) / 10.0;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
