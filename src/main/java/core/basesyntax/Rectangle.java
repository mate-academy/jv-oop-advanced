package core.basesyntax;

public class Rectangle extends Figure {
    private int secondLeg;
    private int firstLeg;

    public Rectangle(String color, int secondLeg, int firstLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String drawFigure() {
        return ("Figure: Rectangle, area: " + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
