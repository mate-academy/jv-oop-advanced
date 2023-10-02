package core.basesyntax;

public class Triangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Triangle(int firstLeg, int secondLeg, String color) {
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: triangle, "
                + "area:" + getArea() + "sq.units, "
                + "firstLeg:" + firstLeg + " units, "
                + "secondLeg:" + secondLeg + " units, "
                + "color:" + super.getColor().toLowerCase();
    }
}
