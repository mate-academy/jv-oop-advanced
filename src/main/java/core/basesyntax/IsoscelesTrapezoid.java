package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int topBase;
    private int hight;

    public IsoscelesTrapezoid(int bottomBase, int topBase, int hight, String color) {
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.hight = hight;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((bottomBase + topBase) / 2) * hight;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid, area: " + getArea() + " sq. units, bottomBase: "
                + bottomBase + " units, topBase: " + topBase + " units, hight: " + hight
                + " units, color: " + color);
    }
}
