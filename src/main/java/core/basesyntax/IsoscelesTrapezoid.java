package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int longBase;
    private int shortBase;
    private int height;

    public IsoscelesTrapezoid(String color, int longBase, int shortBase, int height) {
        super(color);
        this.longBase = longBase;
        this.shortBase = shortBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (longBase + shortBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + calculateArea()
                + " sq. units, short base: " + shortBase
                + " units, long base: " + longBase
                + " units, height: " + height
                + " units, color: " + super.getColor());
    }
}
