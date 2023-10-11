package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double bottomSide, double height, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        this.setArea(getArea());
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topSide " + topSide
                + " units, bottomSide " + bottomSide
                + " units, height " + height
                + " units, color: " + getColor());
    }
}
