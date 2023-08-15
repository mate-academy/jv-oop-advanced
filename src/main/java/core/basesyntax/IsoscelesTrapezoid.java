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
    }

    public double getArea() {
        return (height / 2) * (topSide + bottomSide);
    }

    public String draw() {
        return "Figure: isosceles trapezoid, "
             + "area: " + this.getArea() + " sq.units, "
             + "topSide: " + topSide + " units, "
             + "bottomSide: " + bottomSide + " units, "
             + "height: " + height + " units, "
             + "color: " + this.getColor();
    }
}
