package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseSide;
    private double topSide;
    private double height;

    public IsoscelesTrapezoid(double baseSide, double topSide, double height, String color) {
        super(color);
        this.baseSide = baseSide;
        this.topSide = topSide;
        this.height = height;
    }

    public double getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(double baseSide) {
        this.baseSide = baseSide;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseSide + topSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, baseSide: " + getBaseSide() + " units, topSide: "
                + getTopSide() + " units, height: " + getHeight() + " units, color: "
                + getColor());
    }
}
