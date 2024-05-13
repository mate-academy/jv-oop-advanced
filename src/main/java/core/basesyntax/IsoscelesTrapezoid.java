package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topBase;
    private final int bottomBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) (topBase + bottomBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + calculateArea() + " sq. units, "
                        + "topBase: " + topBase + " units, "
                        + "bottomBase: " + bottomBase + " units, "
                        + "height: " + height + " units, "
                        + "color: " + getColor()
        );
    }
}
