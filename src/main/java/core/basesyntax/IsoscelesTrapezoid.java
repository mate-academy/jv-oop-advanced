package core.basesyntax;

public class IsoscelesTrapezoid extends Rectangle {
    private final double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, String color) {
        super(firstBase, secondBase, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 1 / 2d * (getFirstSide() + getSecondSide()) * height;
    }

    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %2$.1f %3$s,first base: %4$.1f %5$s, "
                        + "second base: %6$.1f %7$s, height: %8$.1f %9$s, color: %10$s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(),
                "sq." + super.getMeasureUnit(getArea()),
                super.getFirstSide(),
                super.getMeasureUnit(getFirstSide()),
                super.getSecondSide(),
                super.getMeasureUnit(getFirstSide()),
                height,
                super.getMeasureUnit(height),
                super.getColor());
    }
}
