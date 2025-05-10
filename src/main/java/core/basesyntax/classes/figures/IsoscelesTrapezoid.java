package core.basesyntax.classes.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int shortBase;
    private final int longBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int shortBase, int longBase, int height) {
        super(color);
        if (shortBase < longBase) {
            this.shortBase = shortBase;
            this.longBase = longBase;
        } else {
            this.shortBase = longBase;
            this.longBase = shortBase;
        }
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) this.height * (this.shortBase + this.longBase) / 2;
    }

    @Override
    public void drawData() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq. units, shortBase: %d units, "
                        + "longBase: %d units, height: %d units, color: %s%n",
                        this.calculateArea(), shortBase, longBase, height, super.getColor());
    }
}
