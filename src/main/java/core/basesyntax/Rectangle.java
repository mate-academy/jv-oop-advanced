package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "figure: rectangle, area: "
                + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + getColor().toString().toLowerCase();
    }
}
