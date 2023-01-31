package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double high;

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double high) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.high = high;
    }

    @Override
    public double getArea() {
        return (((topBase + bottomBase) / 2) * high);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                 + " sq. units, high: " + high + " units, topBase: "
                 + topBase + " units, bottomBase: " + bottomBase + " color: " + getColor());
    }
}
