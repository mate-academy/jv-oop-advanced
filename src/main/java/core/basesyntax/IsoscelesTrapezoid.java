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
        return 0.5 * (shortBase + longBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + shortBase + " units, base2: " + longBase
                + " units, height: " + height + " color: " + getColor());
    }
}
