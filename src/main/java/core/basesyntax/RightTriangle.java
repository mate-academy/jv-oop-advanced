package core.basesyntax;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int hypotenuse, int firstLeg, int secondLeg, String color) {
        super(color);
        this.hypotenuse = hypotenuse;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double obtainArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: rightTriangle, area: " + obtainArea()
                + " sq.units, hypotenuse: "
                + hypotenuse + "units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor());
    }
}
