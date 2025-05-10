package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int lateralSide;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int lateralSide) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.lateralSide = lateralSide;
    }

    @Override
    public double getArea() {
        return ((double) (topSide + bottomSide) / 2)
                * Math.sqrt(Math.pow(lateralSide, 2) - Math.pow(topSide - bottomSide, 2) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top side: " + topSide
                + " units, bottom side: " + bottomSide
                + " units, height: " + lateralSide + " units, color: " + getColor());
    }
}
