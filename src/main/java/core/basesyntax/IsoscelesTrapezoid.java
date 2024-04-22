package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int leg;
    private final int lowerBase;
    private final int topBase;

    public IsoscelesTrapezoid(int leg, int lowerBase, int topBase, Color color) {
        super(color);
        this.leg = leg;
        this.lowerBase = lowerBase;
        this.topBase = topBase;
    }

    public static IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new IsoscelesTrapezoid(
                DimensionSupplier.getRandomDimension(),
                DimensionSupplier.getRandomDimension(),
                DimensionSupplier.getRandomDimension(),
                colorSupplier.getRandomColor()
        );
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area "
                        + calculateArea()
                        + ", leg "
                        + leg
                        + ", lower base "
                        + lowerBase
                        + ", top base "
                        + topBase
                        + ", color: "
                        + getColor()
        );
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (topBase + lowerBase + (leg * 2.0)) / 2;
        return Math.sqrt(
                (semiPerimeter - topBase)
                * (semiPerimeter - lowerBase)
                * Math.pow((semiPerimeter - leg), 2)
        );
    }
}
