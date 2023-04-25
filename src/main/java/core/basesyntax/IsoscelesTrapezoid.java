package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {

    private final double lowerSide;
    private final double upperSide;
    private final double height;

    public IsoscelesTrapezoid(double lowerSide, double upperSide, double height, String color) {
        super(color);
        this.lowerSide = lowerSide;
        this.upperSide = upperSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowerSide * upperSide) * 0.5 * height;
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{"
                + "lowerSide=" + lowerSide
                + ", upperSide=" + upperSide
                + ", height=" + height
                + ", color='" + getColor() + '\''
                + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " height: " + height
                + " loverSide: " + lowerSide
                + " upperSide: " + upperSide
                + " color: " + getColor());
    }
}
