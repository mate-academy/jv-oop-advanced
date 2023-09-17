package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * ((upperBase + lowerBase) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, color="
                + getColor() + ", upperBase=" + upperBase
                + ", lowerBase=" + lowerBase
                + ", height=" + height
                + ", area=" + getArea());
    }
}
