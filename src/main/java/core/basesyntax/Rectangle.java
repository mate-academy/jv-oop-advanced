package core.basesyntax;

public class Rectangle extends Figure {
    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    private final int firstLeg;
    private final int secondLeg;

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "rectangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + getColor().toLowerCase();
    }
}
