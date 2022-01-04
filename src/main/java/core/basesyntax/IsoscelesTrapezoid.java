package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float topSide;
    private float downSide;
    private float height;

    public IsoscelesTrapezoid(String color, float topSide, float downSide, float height) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (topSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea()
                + " sq.units, topSide: " + topSide
                + " sq.units, downSide: " + downSide
                + " sq.units, height: " + height
                + " units, color: " + getColor());
    }
}
