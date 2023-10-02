package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double side;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double side) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.side = side;
    }

    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2
                * Math.sqrt(Math.pow(side, 2) - (Math.pow(Math.abs(topSide - bottomSide), 2) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top side: " + topSide + " units, bottom side: "
                + bottomSide + " units, side: " + side + " units, color: " + super.getColor());
    }
}
