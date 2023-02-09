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

    public double getShortBase() {
        return shortBase;
    }

    public double getLongBase() {
        return longBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((getShortBase() + getLongBase()) / 2) * getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + ", short base: " + getShortBase()
                + ", long base: " + getLongBase()
                + ", height: " + getHeight()
                + ", color: " + getColor());
    }
}
