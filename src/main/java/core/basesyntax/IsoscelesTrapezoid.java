package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + formatDouble(getArea())
                + " sq. units, " + "top base: " + formatDouble(topBase)
                + " units, bottom base: " + formatDouble(bottomBase)
                + " units, height: " + formatDouble(height) + " units, color: " + getColor());
    }
}
