package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double topSide, double bottomSide,
                              double height, double area, String color) {
        super(color, area);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("isosceles trapezoid, " + "area: "
                + areaCalculate(super.getArea()) + " sq.units, "
                + "top side: " + topSide + " units," + " bottom side: " + bottomSide
                + " units," + " grounds: " + height + " units," + " color: " + getColor());
    }

    @Override
    public double areaCalculate(double area) {
        return ((bottomSide + topSide) / 2) * height;
    }
}
