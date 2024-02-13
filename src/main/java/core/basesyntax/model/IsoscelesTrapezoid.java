package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private final double firstParallel;
    private final double secondParallel;
    private final double height;

    public IsoscelesTrapezoid(double firstParallel, double secondParallel, double height) {
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height / 2 * (firstParallel + secondParallel);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, height: "
                + height
                + " units, firstParallel: "
                + firstParallel
                + " units, secondParallel: "
                + secondParallel
                + " units, color: "
                + getColor());
    }
}
