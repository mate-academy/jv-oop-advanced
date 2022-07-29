package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double grounds;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double topSide, double bottomSide,
                              double grounds, double area, String color) {
        super(color, area);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.grounds = grounds;
    }

    @Override
    public void draw() {
        System.out.println("isosceles trapezoid, " + "area: " + getArea() + " sq.units, "
                + "top side: " + topSide + " units," + " bottom side: " + bottomSide
                + " units," + " grounds: " + grounds + " units," + " color: " + getColor());
    }
}
