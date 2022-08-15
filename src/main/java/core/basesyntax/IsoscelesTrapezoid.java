package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int thirdLeg;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int thirdLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg + secondLeg) * thirdLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "isoscelesTrapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "thirdLeg: " + thirdLeg + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
