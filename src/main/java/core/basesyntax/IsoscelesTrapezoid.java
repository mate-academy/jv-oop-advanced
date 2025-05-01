package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.print("Figure: IsoscelesTrapezoid, area: " + getArea()
                + "sq. units, topBase: " + topBase + ", bottomBase: " + bottomBase
                + ",height: " + height + " units, color: " + getColor());
    }
}
