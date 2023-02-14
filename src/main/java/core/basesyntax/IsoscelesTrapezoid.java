package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double side;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double side, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(Math.pow(((firstLeg + secondLeg + side * 2) / 2 - firstLeg)
                * ((firstLeg + secondLeg + side * 2) / 2 - secondLeg)
                * ((firstLeg + secondLeg + side * 2) / 2 - side), 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", side: " + side + " units"
                + ", color: " + getColor().name().toLowerCase());
    }
}
