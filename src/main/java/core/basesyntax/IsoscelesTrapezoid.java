package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private Random random;
    private double topBase;
    private double bottomBase;
    private double height;
    private double leg;

    public IsoscelesTrapezoid() {
        this.random = new Random();
        this.topBase = random.nextDouble(100, 1000);
        this.bottomBase = random.nextDouble(100, 1000);
        this.height = random.nextDouble(100, 1000);
        this.leg = random.nextDouble(100, 1000);
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid: units, area: " + getArea() +
                " sq. units, topBase: " + topBase + " sq. units, bottomBase: "
                + bottomBase + " sq. units, height: " + height +
                " sq. units, leg: " + leg + " units, color: "
                + ColorSupplier.getRandomColor());
    }
}
