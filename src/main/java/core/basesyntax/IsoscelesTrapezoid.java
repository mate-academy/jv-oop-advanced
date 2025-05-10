package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, Color color) {
        super.setColor(color);
        this.height = height;
        this.bottomBase = bottomBase;
        this.topBase = topBase;
    }

    @Override
    public double getArea() {
        return bottomBase * topBase * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "height: " + height + " units "
                + "top base: " + topBase + " units, "
                + "bottom base: " + bottomBase + " units "
                + "color: " + getColor());
    }
}
