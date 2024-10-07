package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(
            String color,
            double firstBase,
            double secondBase,
            double height
    ) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %f, "
                        + "firstBase: %f, secondBase: %f, height: %f, color: %s\n",
                getArea(),
                firstBase,
                secondBase,
                height,
                color
        );
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) * height) / 2;
    }
}
