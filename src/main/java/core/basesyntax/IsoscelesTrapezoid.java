package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int thirdLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    private final int firstLeg;
    private final int secondLeg;
    private final int thirdLeg;

    @Override
    public double calculateArea() {
        return (firstLeg + secondLeg) * thirdLeg / 2.0;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "isoscelesTrapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "thirdLeg: " + thirdLeg + " units, "
                + "color: " + getColor().toLowerCase();
    }
}
