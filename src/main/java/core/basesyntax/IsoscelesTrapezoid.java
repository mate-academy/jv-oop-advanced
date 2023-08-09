package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int downSide, int height) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (topSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq.units, topSide: " + topSide + " units, downSide:"
                + downSide + " units, height:" + height + " units, color: " + getColor());
    }
}
