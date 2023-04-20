package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topBase;
    private final int bottomBase;

    public IsoscelesTrapezoid(String color, int height, int topBase, int bottomBase) {
        this.bottomBase = bottomBase;
        this.height = height;
        this.topBase = topBase;
        setColor(Colors.valueOf(color));
    }

    @Override
    public double getArea() {
        return (bottomBase + topBase) * height / 2;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, bottom base: " + bottomBase
                + " units, top base: " + topBase
                + " units, height: " + height
                + " units, color: " + getColor().name().toLowerCase());
    }
}
