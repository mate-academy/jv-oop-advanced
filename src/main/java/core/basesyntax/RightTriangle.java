package core.basesyntax;

import java.util.Random;

public class RightTriangle extends AbstractFigure {
    private Random random;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
        this.random = new Random();
        this.firstLeg = random.nextDouble(100, 1000);
        this.secondLeg = random.nextDouble(100, 1000);
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg + secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle: units, area: "
                + getArea()
                + " sq. units, firstLeg: "
                + firstLeg
                + " sq. units, side: "
                + secondLeg
                + " units, color: "
                + getColor());
    }
}
