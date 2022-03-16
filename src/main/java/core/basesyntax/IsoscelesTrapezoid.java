package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int firstBase;
    private final int secondBase;

    public IsoscelesTrapezoid(String color, int height, int firstBase, int secondBase) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %s sq.units, "
                + "height: %s units, base1: %s units, base2: %s units, color: %s%n",
                getArea(), height, firstBase, secondBase, getColor());
    }
}
