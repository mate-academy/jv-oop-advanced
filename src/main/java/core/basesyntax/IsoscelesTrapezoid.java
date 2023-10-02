package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private double isoscelesTrapezoidSide;
    private double baseUp;
    private double baseDown;
    private double height;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public IsoscelesTrapezoid(double area, String color, double isoscelesTrapezoidSide,
                              double baseDown, double baseUp) {
        super(area, color);
        this.isoscelesTrapezoidSide = isoscelesTrapezoidSide;
        this.baseDown = baseDown;
        this.baseUp = baseUp;
    }

    public IsoscelesTrapezoid() {

    }

    public double getBaseDown() {
        return baseDown;
    }

    public double getBaseUp() {
        return baseUp;
    }

    public double getHeight() {
        return Math.sqrt(isoscelesTrapezoidSide * isoscelesTrapezoidSide
                - ((baseDown - baseUp) / 2) * ((baseDown - baseUp) / 2));
    }

    @Override
    public double countArea() {
        return getHeight() * ((baseUp + baseDown) / 2);
    }

    public double getIsoscelesTrapezoidSide() {
        return isoscelesTrapezoidSide;
    }

    public double getRandomSide() {
        return random.nextInt(100);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        double randomSide = getRandomSide();

        double maxBase = 2 * randomSide;
        double minBase = randomSide;

        double randomBaseUp = Math.round((minBase + (maxBase - minBase)
                * random.nextDouble()) * 100.0) / 100.0;
        double randomBaseDown = Math.round((minBase + (maxBase - minBase)
                * random.nextDouble()) * 100.0) / 100.0;

        return new IsoscelesTrapezoid(countArea(), colorSupplier.getRandomColor(), randomSide,
                randomBaseDown, randomBaseUp);
    }

    @Override
    public void draw() {
        IsoscelesTrapezoid randomIsoscelesTrapezoid = getRandomIsoscelesTrapezoid();
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + randomIsoscelesTrapezoid.countArea() + " sq.units, side: "
                + randomIsoscelesTrapezoid.getIsoscelesTrapezoidSide() + " units, baseDown: "
                + randomIsoscelesTrapezoid.getBaseDown() + " units, baseUp: "
                + randomIsoscelesTrapezoid.getBaseUp() + " units, color: "
                + colorSupplier.getRandomColor());
    }
}
