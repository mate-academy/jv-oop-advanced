package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int shortBase;
    private int longBase;
    private int height;

    public IsoscelesTrapezoid(String color, int shortBase, int longBase, int height) {
        super(color);
        this.shortBase = shortBase;
        this.longBase = longBase;
        this.height = height;
    }

    @Override
    public double area() {
        return shortBase * height + (longBase - shortBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units,"
                + " shortBase: %d units, longBase: %d units, height: %d units, color: %s%n",
                area(), shortBase, longBase, height, getColor().toLowerCase());
    }
}
