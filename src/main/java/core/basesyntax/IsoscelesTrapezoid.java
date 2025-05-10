package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid(String color, double height, double topBase, double bottomBase) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("isosceles trapezoid,"
                + " area: " + getArea() + " sq. units,"
                + " topBase: " + topBase + " units,"
                + " bottomBase: " + bottomBase + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor());
    }
}
