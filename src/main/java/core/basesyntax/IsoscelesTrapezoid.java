package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double getArea() {
        return ((topSide + bottomSide) * 0.5) * height;
    }

    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, topSide: " + topSide
                + " bottomSide: " + bottomSide
                + " height: " + height
                + " units, color: " + getColor());
    }
}
