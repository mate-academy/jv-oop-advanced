package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int topBase;
    private int  height;

    public IsoscelesTrapezoid(int bottomBase, int topBase, int height, Color color) {
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((bottomBase + topBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid, area: " + getArea() + " sq. units, bottomBase: "
                + bottomBase + " units, topBase: " + topBase + " units, height: " + height
                + " units, color: " + color);
    }
}
