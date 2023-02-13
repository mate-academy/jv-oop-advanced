package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double shortBase;
    private double longBase;
    private double height;

    public IsoscelesTrapezoid(String color, double shortBase, double longBase, double height) {
        super(color);
        this.shortBase = shortBase;
        this.longBase = longBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((shortBase + longBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + ", short base: " + shortBase
                + ", long base: " + longBase
                + ", height: " + height
                + ", color: " + getColor());
    }
}
