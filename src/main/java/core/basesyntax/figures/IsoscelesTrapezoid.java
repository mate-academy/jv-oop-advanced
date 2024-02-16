package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int firstSide;
    private final int secondSide;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) * 0.5 * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s\nArea: %.2f\nFirst side: %d\nSecond side: %d\nColor: %s\n\n",
                getClass().getSimpleName(), getArea(), firstSide, secondSide, getColor());
    }
}
