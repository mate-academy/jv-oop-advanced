package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea() + " sq.units,");
        System.out.println("topBase: " + topBase + ", bottomBase: " + bottomBase + 
                           ", height: " + height + ", color: " + color.name().toLowerCase());
    }
}
