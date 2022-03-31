package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double height) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public String draw() {
        return "figure: rectangle, area: "
                + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, height: "
                + height + " units, color: "
                + getColor().toString().toLowerCase();
    }
}
