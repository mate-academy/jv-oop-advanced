package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return firstSide;
    }

    public void draw() {
        System.out.printf("Figure: %1$s, area: %2$.1f %3$s,first side: %4$.1f %5$s, "
                        + "second side: %6$.1f %7$s, color: %8$s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(),
                "sq." + super.getMeasureUnit(this.getArea()),
                firstSide,
                super.getMeasureUnit(firstSide),
                secondSide,
                super.getMeasureUnit(secondSide),
                super.getColor());
    }
}
