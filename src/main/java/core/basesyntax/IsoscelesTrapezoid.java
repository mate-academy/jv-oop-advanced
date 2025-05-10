package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double topBase;
    private final double bottomBase;

    private final double height;

    private final double area;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase,
            double height) {
        super(color);
        this.topBase = Math.ceil(topBase * 10) / 10;
        this.bottomBase = Math.ceil(bottomBase * 10) / 10;
        this.height = Math.ceil(height * 10) / 10;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.ceil(((topBase + bottomBase) / 2 * height) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: IsoscelesTrapezoid, area: " + area + " sq. units, topBase: " + topBase
                + ", bottomBase: " + bottomBase + ", color: " + getColor());
    }
}
