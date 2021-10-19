package core.basesyntax;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setArea(0.5 * firstLeg * secondLeg);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, firs leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + getColor());
    }
}
