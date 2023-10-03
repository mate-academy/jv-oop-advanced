package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(Color color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((topBase + bottomBase) * 0.5) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid "
                + " area " + calculateArea() + " sq.units,"
                + " topBase " + topBase + " units,"
                + "bottomBase" + bottomBase + " units"
                + " height " + height + " units,"
                + " color " + getColor());
    }
}
