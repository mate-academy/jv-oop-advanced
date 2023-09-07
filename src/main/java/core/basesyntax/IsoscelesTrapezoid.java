package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double high;
    private double bottomSide;
    private double topSide;

    public IsoscelesTrapezoid(String name, String color, double high,
                              double bottomSide, double topSide) {
        super(name, color);
        this.high = high;
        this.bottomSide = bottomSide;
        this.topSide = topSide;
    }

    @Override
    public double areaCalculating() {
        return ((topSide + bottomSide) / 2) * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getName()
                + ", "
                + "area: "
                + areaCalculating()
                + " sq.units, "
                + "high: "
                + this.high
                + " units, "
                + "bottomSide: "
                + this.bottomSide
                + " units, "
                + "topSide: "
                + this.topSide
                + " units, "
                + "color: "
                + getColor());
    }
}
