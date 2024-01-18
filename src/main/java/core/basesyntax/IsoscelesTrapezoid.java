package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int longBase;
    private final int shortBase;
    private final int heightBase;

    public IsoscelesTrapezoid(Color color, int longBase, int shortBase, int heightBase) {
        super(color);
        this.longBase = longBase;
        this.shortBase = shortBase;
        this.heightBase = heightBase;
    }

    @Override
    public double calculateArea() {
        return ((longBase + shortBase) * heightBase) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Shape: isosceles trapezoid, area: " + calculateArea()
                + "sq. units, longBase: " + longBase
                + "sq. units, shortBase: " + shortBase + "sq. units, height: "
                + heightBase + "sq. units, color: " + getColor());
    }
}
