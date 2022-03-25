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
    public double area() {
        return (shortBase + longBase) / 2 * height;
    }

    @Override
    public void print() {
        System.out.println("IsoscelesTrapezoid color " + getColor()
                           + " first base " + shortBase
                           + " second base length " + longBase
                           + " height " + height
                           + " area " + area());
    }
}
