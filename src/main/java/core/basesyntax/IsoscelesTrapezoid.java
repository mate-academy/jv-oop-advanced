package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq. units, topBase: " + topBase + " units, bottomBase: "
                + bottomBase + " units, height: " + height + " units, color: " + getColor());
    }
}

