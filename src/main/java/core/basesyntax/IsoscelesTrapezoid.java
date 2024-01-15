package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstParallel;
    private final int secondParallel;
    private final int height;

    public IsoscelesTrapezoid(Color color, int firstParallel, int secondParallel, int height) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (firstParallel + secondParallel) / (double) 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea() + " sq.units, "
                + "firstParallel: " + firstParallel + " units, "
                + "secondParallel: " + secondParallel + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());
    }
}
