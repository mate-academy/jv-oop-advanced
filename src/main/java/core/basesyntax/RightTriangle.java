package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
        setFigureType("right triangle");
        calculateArea();
    }

    @Override
    public void calculateArea() {
        setArea(1 / 2 * firstLeg * secondLeg);
    }

    @Override
    public String toString() {
        return super.toString()
                + getFigureType()
                + ", area: "
                + getArea()
                + " sq.units"
                + ", first leg: "
                + firstLeg
                + " units, second leg: "
                + secondLeg
                + " units, color: "
                + getColor();
    }
}
