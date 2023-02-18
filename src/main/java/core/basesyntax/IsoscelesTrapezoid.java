package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomSide;
    private double upperSide;
    private double side;

    public IsoscelesTrapezoid(double bottomBase, double upperBase, double side, String color) {
        super(color);
        this.bottomSide = bottomBase;
        this.upperSide = upperBase;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (bottomSide + upperSide) / 2 * Math.sqrt(Math.pow(side, 2)
                - (Math.pow((side - bottomSide), 2) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + calculateArea()
                + " sq units, bottomSide: " + bottomSide + " units, upperSide: " + upperSide
                + " units, side: " + side + " units, color: " + getColor());
    }
}
