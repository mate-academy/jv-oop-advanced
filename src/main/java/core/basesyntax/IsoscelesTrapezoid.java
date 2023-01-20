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
        return (topBase + bottomBase) * height / 2;
    }

    public void draw() {
        System.out.println("Figure: " + getClass().getName() + ",  area: " + getArea() + "sq.units" + "  aSide: "
                + topBase + "units" + "  color: " + getColor());
    }
}
