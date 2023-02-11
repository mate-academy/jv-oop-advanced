package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, top side: "
                + topSide + " units, bottom side; "
                + bottomSide + " units, height; "
                + height + " color: "
                + getColor().toString().toLowerCase());
    }
}
