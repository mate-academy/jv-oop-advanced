package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double bottomBase, double height, double topBase) {
        super(color);
        this.bottomBase = bottomBase;
        this.height = height;
        this.topBase = topBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trpezoid, area: " + getArea()
                + " sq. units, topBase: " + topBase + " units, bottomBase: " + bottomBase
                + " units, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }
}
