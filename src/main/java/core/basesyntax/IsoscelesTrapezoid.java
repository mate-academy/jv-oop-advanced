package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double height;
    private double bottomBase;

    public IsoscelesTrapezoid(String color, double topBase, double height, double bottomBase) {
        super(color);
        this.topBase = topBase;
        this.height = height;
        this.bottomBase = bottomBase;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + ", top base: " + topBase + ", bottom base: " + bottomBase + ", height: " + height
                + ", color: " + getColor());
    }
}
