package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int angle;

    public IsoscelesTrapezoid(Color color, int firstLeg, int secondLeg, int angle) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return firstLeg * Math.sin(angle) * (secondLeg - firstLeg * Math.cos(angle));
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + "units, secondLeg: "
                + secondLeg + "units, angle: " + angle + " units, color: "
                + getColor().name().toLowerCase());

    }
}
