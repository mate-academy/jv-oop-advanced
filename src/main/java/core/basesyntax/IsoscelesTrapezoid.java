package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomBase;
    private double upperBase;
    private double side;

    public IsoscelesTrapezoid(double bottomBase, double upperBase, double side, String color) {
        super(color);
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double altitude = Math.sqrt(side * side - Math.pow((bottomBase - upperBase), 2) / 4);
        return (upperBase + bottomBase) * altitude / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + calculateArea()
                + " sq.units, bottomBase: " + bottomBase + " units, upperBase: " + upperBase
                + " units, side: " + side + " units, color: " + getColor());
    }
}
