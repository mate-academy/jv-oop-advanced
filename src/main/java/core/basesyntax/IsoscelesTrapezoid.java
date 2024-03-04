package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
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
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units," 
            + " topBase: " + topBase + ", bottomBase: " + bottomBase 
            + ", height: " + height + ", color: " + color);
    }
}
