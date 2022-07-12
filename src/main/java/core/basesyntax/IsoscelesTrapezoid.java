package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double downside;
    private final double upside;
    private final double hight;

    public IsoscelesTrapezoid(String color, int downside, int upside, int hight) {
        super(color);
        this.downside = downside;
        this.upside = upside;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return (downside + upside) / 2 * hight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid; area: " + getArea() + " square units;"
                + " downside: " + downside + " units; "
                + " upside: " + upside + " units;"
                + " hight: " + hight + " units; "
                + getColor());
    }
}
