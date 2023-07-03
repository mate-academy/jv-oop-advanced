package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, String color) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = 0.5 * height * (topBase + bottomBase);
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass().getSuperclass().getName()
                + ": isoscelesTrapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "topBase: " + topBase + " units"
                + ", bottomBase: " + bottomBase + " units"
                + ", height:" + height + " units"
                + ", color: " + getColor());
    }
}
