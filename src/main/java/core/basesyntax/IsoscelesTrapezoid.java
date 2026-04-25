package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int height;
    private int topBase;
    private int bottomBase;

    public IsoscelesTrapezoid(int height, int topBase, int bottomBase, String color) {
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "isosceles trapezoid, " + "area: "
                + getArea() + " sq. units, topBase: " + topBase + " units, bottomBase: "
                + bottomBase + " units, height: " + height + ", color: " + color);
    }

}
