package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private Random random = new Random();

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle() {
        firstLeg = random.nextDouble();
        secondLeg = random.nextDouble();
        setColor(random);
        this.color = getColor();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}
