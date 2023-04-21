package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int topBase;
    private final int bottomBase;

    public IsoscelesTrapezoid(Color color, int height, int topBase, int bottomBase) {
        this.bottomBase = bottomBase;
        this.height = height;
        this.topBase = topBase;
        setColor(Color.valueOf(String.valueOf(color)));
    }

    @Override
    public double calculateArea() {
        return (bottomBase + topBase) * height / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, bottom base: " + bottomBase
                + " units, top base: " + topBase
                + " units, height: " + height
                + " units, color: " + getColor().name().toLowerCase());
    }
}
