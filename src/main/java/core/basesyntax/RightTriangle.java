package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle() {

    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) * 0.5;
    }

    @Override
    public String draw() {
        return "Figure: " + Figures.RIGHT_RECTANGLE.name() + ", area: "
                + calculateArea() + " sq.units, "
                + "first leg: " + firstLeg + " units, "
                + "second leg: " + secondLeg + " units, "
                + "color: " + getColor();
    }
}
