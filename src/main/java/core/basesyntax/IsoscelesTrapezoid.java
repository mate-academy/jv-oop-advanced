package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double topBase;
    private double height;

    public IsoscelesTrapezoid(String color, double bottomBase, double topBase, double height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (bottomBase + topBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.calculateArea()
                + " sq.units, bottom base: " + bottomBase + " units, top base: " + topBase
                + " units, height: " + height + " units, color: " + getColor());
    }
}
