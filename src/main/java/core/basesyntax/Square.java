package core.basesyntax;

public class Square extends Figure {
    private final int firstLeg;

    public Square(String color, int firstLeg) {
        super(color);
        this.firstLeg = firstLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * firstLeg;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "square, "
                + "area: " + calculateArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "color: " + getColor().toLowerCase();
    }
}
