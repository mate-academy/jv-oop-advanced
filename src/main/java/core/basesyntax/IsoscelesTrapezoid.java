package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private int firstLeg;
    private int secondLeg;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2.0;
    }

    @Override
    public String getValue() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: "
                + getColor();
    }
}
