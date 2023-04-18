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
    public double getArea() {
        double s;
        s = ((firstLeg + secondLeg) / 4) * Math.sqrt((4 * thirdLeg)) * (4 * thirdLeg)
                - (firstLeg - secondLeg) * (firstLeg - secondLeg);
        return s;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, firstLeg: " + firstLeg + " sq.units, secondLeg: "
                + secondLeg + " sq.units, treeLeg: "
                + thirdLeg + " units, color: " + getColor());
    }
}
