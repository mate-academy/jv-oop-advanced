package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double a, double b) {
        firstLeg = a;
        secondLeg = b;
    }

    public RightTriangle() {
        Random random = new Random();
        firstLeg = random.nextDouble();
        secondLeg = random.nextDouble();
    }

    @Override
    public double getArea() {
        area = firstLeg * secondLeg * 0.5;
        return area;
    }

    @Override
    public String getData() {
        data = "Figure: right triangle, area: " + area + " sq.units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg + " units, color: " + color;
        return data;
    }
}
