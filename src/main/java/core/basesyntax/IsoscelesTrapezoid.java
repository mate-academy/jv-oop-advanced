package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topBase;
    private final int bottomBase;

    public IsoscelesTrapezoid(String color, int height, int topBase, int bottomBase) {
        super(color);
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, height: "
                + height + " units, topBase: "
                + topBase + " units, bottomBase: "
                + bottomBase + " units, color:"
                + getColor());
    }

    @Override
    public double getArea() {
        return (double) ((topBase + bottomBase) * height) / 2;
    }
}
