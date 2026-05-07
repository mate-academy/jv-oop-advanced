package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideTrapezoid1;
    private double sideTrapezoid2;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase,
                              double height, Color color) {
        super(color);
        this.sideTrapezoid1 = topBase;
        this.sideTrapezoid2 = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideTrapezoid1 + sideTrapezoid2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, topBase: " + sideTrapezoid1 + ", bottomBase: "
                + sideTrapezoid2 + ", height: " + height + " units, color: " + color.name());
    }
}
