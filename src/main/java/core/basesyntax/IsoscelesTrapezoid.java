package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstLeg;
    private final int secondLeg;
    private final int treeLeg;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int treeLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.treeLeg = treeLeg;
    }

    @Override
    public double getArea() {
        double s;
        s = ((firstLeg + secondLeg) / 4) * Math.sqrt((4 * treeLeg)
                * (4 * treeLeg) - (firstLeg - secondLeg) * (firstLeg - secondLeg));
        return s;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, firstLeg: " + firstLeg
                + " sq.units, secondLeg: " + secondLeg
                + " sq.units, treeLeg: " + treeLeg
                + " units, color: " + getColor());
    }
}
