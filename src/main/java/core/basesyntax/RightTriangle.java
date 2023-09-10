package core.basesyntax;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(int hypotenuse, int firstLeg, int secondLeg, String color) {
        this.hypotenuse = hypotenuse;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
        setArea(obtainArea());
    }

    @Override
    public double obtainArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq.units, hypotenuse: "
                + hypotenuse + "units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor());
    }
}
