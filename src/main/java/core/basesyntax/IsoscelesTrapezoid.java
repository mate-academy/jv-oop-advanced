package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topBase;
    private final double bottomBase;
    private final double trapezoidHeight;

    public IsoscelesTrapezoid(String color, double topBase,
                              double bottomBase, double trapezoidHeight) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * trapezoidHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.1f", getArea())
                + " sq. units, topBase: " + (int) topBase
                + " units, bottomBase: " + (int) bottomBase
                + " units, trapezoid Height: " + (int) trapezoidHeight
                + " units, color: " + getColor().toLowerCase());
    }

}
