package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double bottomSide;
    private final double height;

    public IsoscelesTrapezoid(Color color, int length, int bottomSide, int height) {
        super(color);
        this.topSide = length;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid"
                + ", area=" + getArea()
                + " sq.units" + "length=" + topSide
                + " units" + ", width=" + bottomSide
                + " units" + ", height=" + height
                + " units" + ", color="
                + getColor());
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2 * height;
    }
}
