package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, Colors color) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) * height) / 2;
    }

    @Override
    public void print() {
        System.out.println(
                "Figure: Isosceles Trapezoid, "
                        + "area: " + getArea() + " sq. units, "
                        + "topBase: " + topBase + " units, "
                        + "bottomBase: " + bottomBase + " units, "
                        + "height: " + height + " units, "
                        + "color: " + getColor().name());
    }
}
