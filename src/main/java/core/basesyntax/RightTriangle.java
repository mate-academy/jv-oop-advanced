package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public void draw() {
        System.out.printf("Figure: right triangle, area: %2$.1f %3$s,first leg: %4$.1f %5$s, "
                        + "second leg: %6$.1f %7$s, color: %8$s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(),
                "sq." + super.getMeasureUnit(getArea()),
                firstLeg,
                super.getMeasureUnit(firstLeg),
                secondLeg,
                super.getMeasureUnit(secondLeg),
                super.getColor());
    }
}
