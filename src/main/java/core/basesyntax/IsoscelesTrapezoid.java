package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int topSide;
    private int side;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int side) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((bottomSide + topSide) / 2.0)
                * Math.sqrt(Math.pow(side, 2)
                - (Math.pow(bottomSide - topSide, 2)) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, bottom side: " + bottomSide + " units, top side: "
                + topSide + " units, side: " + side + " units, color: " + getColor());
    }
}
