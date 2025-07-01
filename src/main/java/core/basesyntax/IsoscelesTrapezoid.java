package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double side;
    private double height;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(double topSide,double bottomSide,double side,double height) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.side = side;
        this.height = height;
    }

    public IsoscelesTrapezoid(String c,double ts,double bs,double s,double h) {
        setColor(c);
        this.topSide = ts;
        this.bottomSide = bs;
        this.side = s;
        this.height = h;
    }

    @Override
    public double getArea() {
        double result = (topSide + bottomSide) / 2 * height;
        return result;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " ,color: " + getColor();
    }
}
