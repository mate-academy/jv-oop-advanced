package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + " sq.units, topSide: "
                + topSide + " units, bottomSide: " + bottomSide + " units, height: " + height
                + " units, color: " + getColor());
    }
}
