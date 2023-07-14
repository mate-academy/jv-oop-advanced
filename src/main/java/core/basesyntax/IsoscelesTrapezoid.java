package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int fistBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int fistBase, int secondBase, int height) {
        super(color);
        this.fistBase = fistBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) ((fistBase + secondBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, "
                        + "area: %.1f sq.units, firstBase: %d units, "
                        + "secondBase: %d units, height: %d units, color: %s%n",
                        calculateArea(), fistBase, secondBase, height, getColor());
    }
}
