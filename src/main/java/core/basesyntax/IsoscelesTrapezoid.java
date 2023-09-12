package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double bottomSide;
    private double topSide;

    public IsoscelesTrapezoid(String name, String color, double high,
                              double bottomSide, double topSide) {
        super(name, color);
        this.height = high;
        this.bottomSide = bottomSide;
        this.topSide = topSide;
    }

    @Override
    public double areaCalculating() {
        return ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", " + "area: " + areaCalculating()
                + " sq.units, " + "high: " + this.height + " units, "
                + "bottomSide: " + this.bottomSide + " units, " + "topSide: " + this.topSide
                + " units, " + "color: " + getColor());
    }
}
