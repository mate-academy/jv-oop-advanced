package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public void drow() {
        System.out.println("Figure: isosceles trapezoid" + ", area: " + getArea()
                         + " sq.units, height: " + height + " units, top base: "
                         + topBase + " units bottom base: "
                         + bottomBase + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2 * height;
    }
}
